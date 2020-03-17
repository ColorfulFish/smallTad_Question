package com.small.tadpole.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/*
 * @Author xu.chenyang
 * @Email xu.chenyang24@gmail.com
 * @Description
 * @Date 18:28 2020/3/16
 **/
@Configuration
@EnableConfigurationProperties(WxExceptionProperties.class)
public class WxExceptionConfigure {
    private WxExceptionProperties wxExceptionProperties;

    @Autowired
    public WxExceptionConfigure(WxExceptionProperties wxExceptionProperties) {
        this.wxExceptionProperties = wxExceptionProperties;
    }

    public WxExceptionProperties getWxExceptionProperties() {
        return wxExceptionProperties;
    }

    public void setWxExceptionProperties(WxExceptionProperties wxExceptionProperties) {
        this.wxExceptionProperties = wxExceptionProperties;
    }
}
