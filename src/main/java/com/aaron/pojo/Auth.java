package com.aaron.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by Aaron Sheng on 2017/10/14.
 */
@ApiModel("授权信息")
public class Auth {
    @ApiModelProperty("用户ID")
    private Long id;
    @ApiModelProperty("凭据")
    private String ticket;

    public Auth() {
    }

    public Auth(Long id, String ticket) {
        this.id = id;
        this.ticket = ticket;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }
}
