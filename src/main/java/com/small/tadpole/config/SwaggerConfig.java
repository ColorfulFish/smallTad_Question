package com.small.tadpole.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/*
 * @Author xu.chenyang
 * @Email chenyang.xu@linkkids.cn
 * @Description
 * @Date 11:14 2020/3/12
 **/
@Configuration
@EnableSwagger2
public class SwaggerConfig extends WebMvcConfigurationSupport {
    /**
     * 设置一个开关，生产版本为false，关闭swagger
     */
    @Value("${swagger.ebable}")
    private boolean ebable;

    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).
                enable(ebable).select().apis(RequestHandlerSelectors.basePackage("com.small.tadpole.controller.kit")). //扫描包
                paths(PathSelectors.any()).build();
        //可以设置为扫描多个包
        /**
         * com.google.common.base.Predicate<RequestHandler> selector1 = RequestHandlerSelectors.basePackage("设置你要扫描的包路径");
         * com.google.common.base.Predicate<RequestHandler> selector2 = RequestHandlerSelectors.basePackage("设置你要扫描的包路径");
         * createRestApi这样写即可。
         * @Bean
         *     public Docket createRestApi(){
         *         return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).
         *         enable(ebable).select().
         *         apis(Predicates.or(selector1,selector2)).
         *         paths(PathSelectors.any()).build();
         *     }
         */
    }


    @SuppressWarnings("deprecation")
    public ApiInfo apiInfo(){
        return new ApiInfoBuilder().title("接口文档").
                description("服务端通用接口").version("1.0").build();
    }

    /**
     * 一定要写这个方法，不然访问swagger-ui.html页面会404
     * @param registry
     */
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**").
                addResourceLocations("classpath:/META-INF/resources/").
                setCachePeriod(0);
    }
}