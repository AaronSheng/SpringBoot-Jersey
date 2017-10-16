package com.aaron.api;

import com.aaron.pojo.Result;
import com.aaron.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by Aaron Sheng on 2017/10/15.
 */
@Api(tags = "USER_USER", description = "用户-用户管理")
@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface UserResource {
    @ApiOperation("获取用户信息")
    @Path("/{userId}")
    @GET
    public Result<User> get(
            @ApiParam(value = "用户ID", required = true)
            @PathParam("userId") Long userId);

    @ApiOperation("删除授权信息")
    @Path("/{userId}")
    @DELETE
    public Result<Boolean> delete(
            @ApiParam(value = "用户ID", required = true)
            @PathParam("userId") Long userId);
}
