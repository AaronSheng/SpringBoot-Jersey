package com.aaron.api;

import com.aaron.api.pojo.Message;
import com.aaron.pojo.Result;
import com.aaron.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by Aaron Sheng on 2018/7/29.
 */
@Api(tags = "MQ_MQ", description = "消息-消息")
@Path("/mqs")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface MqResource {
    @ApiOperation("创建消息")
    @Path("/{userId}")
    @DELETE
    public Result<Boolean> create(
            @ApiParam(value = "用户ID", required = true)
            @PathParam("userId") Long userId,
            @ApiParam(value = "消息内容", required = true)
            Message message
    );
}