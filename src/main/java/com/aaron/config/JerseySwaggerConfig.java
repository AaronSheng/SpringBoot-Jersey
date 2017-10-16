package com.aaron.config;

import io.swagger.jaxrs.config.BeanConfig;
import io.swagger.jaxrs.listing.ApiListingResource;
import io.swagger.jaxrs.listing.SwaggerSerializers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by Aaron Sheng on 2017/10/14.
 */
@Component
@EnableConfigurationProperties(SwaggerProperties.class)
public class JerseySwaggerConfig extends JerseyConfig {
    @Autowired
    private SwaggerProperties swaggerProperties;

    @PostConstruct
    private void init() {
        configSwagger();
        register(SwaggerSerializers.class);
        register(ApiListingResource.class);
    }

    private void configSwagger() {
        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setTitle(swaggerProperties.getTitle());
        beanConfig.setVersion(swaggerProperties.getVersion());
        beanConfig.setContact(swaggerProperties.getContact());
        beanConfig.setBasePath(swaggerProperties.getBasePath());
        beanConfig.setResourcePackage(swaggerProperties.getResourcePackege());
        beanConfig.setScan(true);
    }
}
