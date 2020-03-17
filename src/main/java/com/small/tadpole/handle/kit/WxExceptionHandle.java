package com.small.tadpole.handle.kit;

import com.small.tadpole.config.WxExceptionConfigure;
import com.small.tadpole.domain.result.Result;
import com.small.tadpole.exception.WxRuntimeException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.MethodParameter;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import java.util.concurrent.atomic.AtomicReference;

/*
 * @Author xu.chenyang
 * @Email xu.chenyang24@gmail.com
 * @Description
 * @Date 16:17 2020/3/16
 **/
@RestControllerAdvice(basePackages = {"com.small.tadpole.controller.wx"})
public class WxExceptionHandle {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private WxExceptionConfigure wxExceptionConfigure;

    @ExceptionHandler(value = WxRuntimeException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public Result<Object> handleException(WxRuntimeException e) {
        Result<Object> result = new Result<>();
        Integer code = e.getStatus();
        AtomicReference<String> mesg = new AtomicReference<>();
        wxExceptionConfigure.getWxExceptionProperties().getExceptionList().forEach(item -> {
            if (null != code && code == item.getStatus()) {
                mesg.set(item.getMesg());
            }
        });
        result.setStatus(Integer.valueOf(code));
        if (null != mesg.get()) {
            result.setMessage(mesg.get());
        } else if (null != e.getMessage()) {
            //TODO 判断 status是否已经被注册使用了
            result.setMessage(mesg.get());
        } else if (null == mesg.get()) {
            logger.error("未定义异常 {}", code);
            result.setMessage("系统异常");
        }
        return result;
    }
}
