package com.small.tadpole.filter.wx;

import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.bean.WxMaJscode2SessionResult;
import com.small.tadpole.config.WxMaConfiguration;
import com.small.tadpole.domain.User;
import com.small.tadpole.service.user.wx.WxUserOptionImpl;
import me.chanjar.weixin.common.error.WxErrorException;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/*
 * @Author xu.chenyang
 * @Email chenyang.xu@linkkids.cn
 * @Description
 * @Date 13:56 2020/3/12
 **/
@WebFilter(filterName="wxFilter",urlPatterns = {"/wx--/*"})
public class WxFilter implements Filter {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private WxUserOptionImpl wxUserOption;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {
        String appid = servletRequest.getParameter("appid");
        String code = servletRequest.getParameter("code");
        if(StringUtils.isNotEmpty(appid)&&StringUtils.isNotEmpty(code)){
            final WxMaService wxService = WxMaConfiguration.getMaService(appid);
            WxMaJscode2SessionResult session = null;
            try {
                session = wxService.getUserService().getSessionInfo(code);
                this.logger.info(session.getSessionKey());
                this.logger.info(session.getOpenid());
                //判断用户是否登陆过
                User user = new User();
                user.setOpenid(code);
                user.setSessionid(session.getSessionKey());
                //如果登陆过就更新session
                if(wxUserOption.isLogin(user)){
                    wxUserOption.updateWxSession(user);
                }else {
                    //没有登陆过就创建一个用户
                    wxUserOption.createUser(user);
                }
                filterChain.doFilter(servletRequest,servletResponse);
            } catch (WxErrorException e) {
                servletRequest.getRequestDispatcher("/public/error_500.html").forward(servletRequest,servletResponse);
            }
        }else {
            servletRequest.getRequestDispatcher("/public/error_404.html").forward(servletRequest,servletResponse);
        }
    }

    @Override
    public void destroy() {

    }
}
