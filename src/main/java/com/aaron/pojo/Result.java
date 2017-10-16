package com.aaron.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by Aaron Sheng on 2017/10/14.
 */
@ApiModel("返回数据")
public class Result<T> {
    @ApiModelProperty(value = "状态码", required = true)
    private Integer status;
    @ApiModelProperty(value = "错误信息", required = true)
    private String message;
    @ApiModelProperty(value = "返回数据", required = false)
    private T data;

    public Result(T data) {
        this.status = 0;
        this.data = data;
    }

    public Result(Integer status, String message) {
        this.status = status;
        this.message = message;
    }

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
}
