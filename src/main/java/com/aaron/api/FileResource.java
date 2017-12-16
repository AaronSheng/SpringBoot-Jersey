package com.aaron.api;

import com.aaron.pojo.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.InputStream;

/**
 * Created by Aaron Sheng on 2017/12/16.
 */
@Api(tags = "FILE_FILE", description = "文件-文件管理")
@Path("/file")
public interface FileResource {
    @ApiOperation("上传文件")
    @Path("/upload")
    @POST
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    public Result<Boolean> upload(
            @ApiParam(value = "文件", required = true)
            @FormDataParam("file")
            InputStream inputStream,
            @FormDataParam("file")
            FormDataContentDisposition disposition
    );
}
