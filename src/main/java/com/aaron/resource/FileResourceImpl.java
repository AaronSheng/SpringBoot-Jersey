package com.aaron.resource;

import com.aaron.annotation.RestResource;
import com.aaron.api.FileResource;
import com.aaron.pojo.Result;
import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import java.io.InputStream;

/**
 * Created by Aaron Sheng on 2017/12/16.
 */
@RestResource
public class FileResourceImpl implements FileResource {
    @Override
    public Result<Boolean> upload(InputStream inputStream, FormDataContentDisposition disposition) {
        System.out.println(disposition.getFileName());
        return new Result<Boolean>(true);
    }
}
