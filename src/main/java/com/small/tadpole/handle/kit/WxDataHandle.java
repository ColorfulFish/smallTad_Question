package com.small.tadpole.handle.kit;

import com.small.tadpole.domain.result.Result;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/*
 * @Author xu.chenyang
 * @Email xu.chenyang24@gmail.com
 * @Description
 * @Date 16:17 2020/3/16
 **/
@ControllerAdvice(basePackages = {"com.small.tadpole.controller.wx"})
public class WxDataHandle implements ResponseBodyAdvice {

    @Override
    public boolean supports(MethodParameter methodParameter, Class aClass) {
        return true;
    }

    /**
     * 封装成返回的结果
     * @param o
     * @param methodParameter
     * @param mediaType
     * @param aClass
     * @param serverHttpRequest
     * @param serverHttpResponse
     * @return
     */
    @Override
    public Object beforeBodyWrite(Object o,
                                  MethodParameter methodParameter,
                                  MediaType mediaType,
                                  Class aClass,
                                  ServerHttpRequest serverHttpRequest,
                                  ServerHttpResponse serverHttpResponse) {
        Result<Object> objectResult = new Result<>();
        objectResult.setData(o);
        return objectResult;
    }
}
