package com.aaron.exception;

import com.aaron.pojo.Result;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

/**
 * Created by Aaron Sheng on 2017/10/15.
 */
public class BadRequestExceptionMapper implements ExceptionMapper<BadRequestException> {
    @Override
    public Response toResponse(BadRequestException e) {
        int status = 400;
        String message = e.getMessage();
        return Response.status(status)
                .type(MediaType.APPLICATION_JSON_TYPE)
                .entity(new Result<Void>(status, message))
                .build();
    }
}
