package com.imaging.content.received.module.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by irichiez on 5/13/17.
 */
@Component
@ConfigurationProperties(prefix = "documentConfig")
public class DocumentConfig {

    //@Value("${documentConfig.appName}")
    private String appName;
    private String addDescription;
    private String adminFirstname;
    private String adminLastname;
    private String adminEmail;

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAddDescription() {
        return addDescription;
    }

    public void setAddDescription(String addDescription) {
        this.addDescription = addDescription;
    }

    public String getAdminFirstname() {
        return adminFirstname;
    }

    public void setAdminFirtname(String adminFirtname) {
        this.adminFirstname = adminFirtname;
    }

    public String getAdminLastname() {
        return adminLastname;
    }

    public void setAdminLastname(String adminLastname) {
        this.adminLastname = adminLastname;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    @Override
    public String toString() {
        return "DocumentConfig{" +
                "appName='" + appName + '\'' +
                ", addDescription='" + addDescription + '\'' +
                ", adminFirtname='" + adminFirstname + '\'' +
                ", adminLastname='" + adminLastname + '\'' +
                ", adminEmail='" + adminEmail + '\'' +
                '}';
    }
}
