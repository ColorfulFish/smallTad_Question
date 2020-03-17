package com.small.tadpole.domain.result;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/*
 * @Author xu.chenyang
 * @Email xu.chenyang24@gmail.com
 * @Description
 * @Date 16:11 2020/3/16
 **/
@ApiModel(value="com.small.tadpole.domain.result.Result")
public class Result<T> {
    /** 错误码. */
    @ApiModelProperty(value="错误码 0 表示成功,其他为错误编码")
    private Integer status = 0;

    @ApiModelProperty(value="时间戳")
    private long timestamp = System.currentTimeMillis();

    /** 提示信息. */
    @ApiModelProperty(value="提示信息")
    private String message;

    /** 具体的内容. */
    @ApiModelProperty(value="具体的内容")
    private T data;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
