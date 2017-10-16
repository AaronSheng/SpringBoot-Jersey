package com.aaron.api;

import com.aaron.pojo.Auth;
import com.aaron.pojo.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by Aaron Sheng on 2017/10/15.
 */
@Api(tags = "AUTH_AUTH", description = "用户-用户管理")
@Path("/auths")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface AuthResource {
    @ApiOperation("获取授权信息")
    @Path("/{userId}")
    @GET
    public Result<Auth> get(
            @ApiParam(value = "用户ID", required = true)
            @PathParam("userId") Long userId);

    @ApiOperation("删除授权信息")
    @Path("/{userId}")
    @DELETE
    public Result<Boolean> delete(
            @ApiParam(value = "用户ID", required = true)
            @PathParam("userId") Long userId);
}
