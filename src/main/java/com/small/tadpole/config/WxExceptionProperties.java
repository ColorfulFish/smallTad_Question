package com.small.tadpole.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/*
 * @Author xu.chenyang
 * @Email chenyang.xu@linkkids.cn
 * @Description
 * @Date 13:39 2020/3/12
 **/
@Data
@ConfigurationProperties(prefix = "wx.miniapp.exception")
public class WxExceptionProperties {
    private List<MesgException> exceptionList;

    @Data
    public static class MesgException {
        /**
         * 错误编码
         */
        private String code;

        /**
         * 错误信息描述
         */
        private String mesg;


    }

    public List<MesgException> getExceptionList() {
        return exceptionList;
    }

    public void setExceptionList(List<MesgException> exceptionList) {
        this.exceptionList = exceptionList;
    }
}
