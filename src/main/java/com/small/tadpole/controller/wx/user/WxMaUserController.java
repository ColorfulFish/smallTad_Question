package com.small.tadpole.controller.wx.user;

import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.bean.WxMaJscode2SessionResult;
import cn.binarywang.wx.miniapp.bean.WxMaPhoneNumberInfo;
import cn.binarywang.wx.miniapp.bean.WxMaUserInfo;
import com.small.tadpole.config.WxMaConfiguration;
import com.small.tadpole.domain.User;
import com.small.tadpole.service.user.wx.WxUserOptionImpl;
import com.small.tadpole.utils.JsonUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import me.chanjar.weixin.common.error.WxErrorException;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    @ApiOperation(value="登陆",notes="开始页数,页数大小", httpMethod = "GET")
    @GetMapping("/login")
    public User login(@PathVariable String appid, String code) throws WxErrorException {
        User user = null;
        if (StringUtils.isBlank(code)) {
            return null;
        }
        final WxMaService wxService = WxMaConfiguration.getMaService(appid);
        WxMaJscode2SessionResult session = wxService.getUserService().getSessionInfo(code);
        if (null != session && null != session.getSessionKey()) {
            user = wxUserOption.getOneUser(code);
        }
        return user;
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
