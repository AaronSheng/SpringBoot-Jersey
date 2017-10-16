package com.aaron.exception;

import com.aaron.pojo.Result;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

/**
 * Created by Aaron Sheng on 2017/10/15.
 */
public class NotFoundExceptionMapper implements ExceptionMapper<NotFoundException> {
    @Override
    public Response toResponse(NotFoundException e) {
        int status = 500;
        String message = e.getMessage();
        return Response.status(status)
                .type(MediaType.APPLICATION_JSON_TYPE)
                .entity(new Result<Void>(status, message))
                .build();
    }
}
