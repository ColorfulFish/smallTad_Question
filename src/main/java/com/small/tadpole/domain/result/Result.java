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
    private Integer code = 0;

    /** 提示信息. */
    @ApiModelProperty(value="提示信息")
    private String msg;

    /** 具体的内容. */
    @ApiModelProperty(value="具体的内容")
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
