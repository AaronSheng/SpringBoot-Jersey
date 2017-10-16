package com.aaron.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by Aaron Sheng on 2017/10/8.
 */
@ApiModel("用户信息")
public class User {
    @ApiModelProperty("用户ID")
    private Long id;
    @ApiModelProperty("用户名称")
    private String name;

    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
