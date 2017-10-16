package com.aaron.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by Aaron Sheng on 2017/10/14.
 */
@ConfigurationProperties(prefix = "swagger")
public class SwaggerProperties {
    private String title;
    private String version;
    private String contact;
    private String basePath;
    private String resourcePackege;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getBasePath() {
        return basePath;
    }

    public void setBasePath(String basePath) {
        this.basePath = basePath;
    }

    public String getResourcePackege() {
        return resourcePackege;
    }

    public void setResourcePackege(String resourcePackege) {
        this.resourcePackege = resourcePackege;
    }
}
