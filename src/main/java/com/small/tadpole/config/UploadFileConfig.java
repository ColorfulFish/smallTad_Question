package com.small.tadpole.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/*
 * @Author xu.chenyang
 * @Email xu.chenyang24@gmail.com
 * @Description
 * @Date 15:25 2020/3/16
 **/
@Configuration
public class UploadFileConfig implements WebMvcConfigurer {
    @Value("${pic.upload.path}")
    private String uploadPicPath;
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/temp-pic/").addResourceLocations(uploadPicPath);
    }
}
