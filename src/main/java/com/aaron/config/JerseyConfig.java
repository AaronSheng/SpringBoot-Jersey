package com.aaron.config;

import com.aaron.annotation.RestResource;
import com.aaron.api.AuthResource;
import com.aaron.api.UserResource;
import com.aaron.exception.BadRequestExceptionMapper;
import com.aaron.exception.NotFoundExceptionMapper;
import io.swagger.jaxrs.config.BeanConfig;
import io.swagger.jaxrs.listing.ApiListingResource;
import io.swagger.jaxrs.listing.SwaggerSerializers;
import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.ws.rs.ApplicationPath;
import java.util.Map;

/**
 * Created by Aaron Sheng on 2017/10/8.
 */
@ApplicationPath("/api")
public class JerseyConfig extends ResourceConfig implements ApplicationContextAware, InitializingBean {
    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        register(BadRequestExceptionMapper.class);
        register(NotFoundExceptionMapper.class);
        register(MultiPartFeature.class);
        Map<String, Object> resources = applicationContext.getBeansWithAnnotation(RestResource.class);
        for (Object object : resources.values()) {
            register(object);
        }
    }
}
