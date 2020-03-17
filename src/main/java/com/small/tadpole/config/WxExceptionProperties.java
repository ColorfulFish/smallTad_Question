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
        private Integer status;

        /**
         * 错误信息描述
         */
        private String mesg;

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public String getMesg() {
            return mesg;
        }

        public void setMesg(String mesg) {
            this.mesg = mesg;
        }
    }

    public List<MesgException> getExceptionList() {
        return exceptionList;
    }

    public void setExceptionList(List<MesgException> exceptionList) {
        this.exceptionList = exceptionList;
    }
}
