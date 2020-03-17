package com.small.tadpole.controller.wx.user;

import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.bean.WxMaJscode2SessionResult;
import cn.binarywang.wx.miniapp.bean.WxMaPhoneNumberInfo;
import cn.binarywang.wx.miniapp.bean.WxMaUserInfo;
import com.small.tadpole.config.WxMaConfiguration;
import com.small.tadpole.domain.User;
import com.small.tadpole.exception.WxRuntimeException;
import com.small.tadpole.service.user.wx.WxUserOptionImpl;
import com.small.tadpole.utils.JsonUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import me.chanjar.weixin.common.error.WxErrorException;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/*
 * @Author xu.chenyang
 * @Email chenyang.xu@linkkids.cn
 * @Description
 * @Date 13:35 2020/3/12
 **/
@RestController
@RequestMapping("/wx/user")
@Api(value="微信用户接口")
public class WxMaUserController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private WxUserOptionImpl wxUserOption;
    /**
     * 登陆接口
     */
    @ApiOperation(value="登陆", httpMethod = "POST")
    @PostMapping("/login/{appid}/{code}")
    public User login(@ApiParam(value = "appid 用户登陆的appid",required = true) @PathVariable String appid,
                      @ApiParam(value = "code 用户登陆的code",required = true)@PathVariable String code){
        User user = null;
        final WxMaService wxService = WxMaConfiguration.getMaService(appid);
        WxMaJscode2SessionResult session = null;
        try {
            if(StringUtils.isNotEmpty(appid)&&StringUtils.isNotEmpty(code)) {
                session = wxService.getUserService().getSessionInfo(code);
                if (null != session && null != session.getSessionKey()) {
                    user = wxUserOption.getOneUser(code);
                } else {
                    //登陆失败异常
                    throw new WxRuntimeException(100);
                }
            }else {
                //登陆的appid和code不能为空/login/{appid}/{code}
                throw new WxRuntimeException(102);
            }
        } catch (WxErrorException e) {
            //微信异常
            logger.error(e.getMessage());
            throw new WxRuntimeException(101);
        }finally {
            return user;
        }
    }

    /**
     * <pre>
     * 获取用户信息接口
     * </pre>
     */
    @ApiOperation(value="获取用户信息",notes="开始页数,页数大小", httpMethod = "GET")
    @GetMapping("/info")
    public String info(@PathVariable String appid, String sessionKey,
                       String signature, String rawData, String encryptedData, String iv) {
        final WxMaService wxService = WxMaConfiguration.getMaService(appid);

        // 用户信息校验
        if (!wxService.getUserService().checkUserInfo(sessionKey, rawData, signature)) {
            return "user check failed";
        }

        // 解密用户信息
        WxMaUserInfo userInfo = wxService.getUserService().getUserInfo(sessionKey, encryptedData, iv);

        return JsonUtils.toJson(userInfo);
    }

    /**
     * <pre>
     * 获取用户绑定手机号信息
     * </pre>
     */
    @ApiOperation(value="获取用户绑定手机",notes="开始页数,页数大小", httpMethod = "GET")
    @GetMapping("/phone")
    public String phone(@PathVariable String appid, String sessionKey, String signature,
                        String rawData, String encryptedData, String iv) {
        final WxMaService wxService = WxMaConfiguration.getMaService(appid);

        // 用户信息校验
        if (!wxService.getUserService().checkUserInfo(sessionKey, rawData, signature)) {
            return "user check failed";
        }

        // 解密
        WxMaPhoneNumberInfo phoneNoInfo = wxService.getUserService().getPhoneNoInfo(sessionKey, encryptedData, iv);

        return JsonUtils.toJson(phoneNoInfo);
    }

}
