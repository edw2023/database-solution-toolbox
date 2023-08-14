package com.pw.db.solution.toolbox.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;
import java.util.Properties;

@ConfigurationProperties
public class FlywayProperties {
    @Value("datasource.url")
    private String dataSourceUrl;
    @Value("datasource.username")
    private String dataSourceUserName;
    @Value("datasource.password")
    private String dataSourcePassword;
    @Value("scripts.filePath")
    private String scriptsFilePath;

    public Properties getProperties() {
        Properties properties = new Properties();
        properties.put("flyway.url",dataSourceUrl);
        properties.put("flyway.user",dataSourceUserName);
        properties.put("flyway.password",dataSourcePassword);
        properties.put("flyway.locations",scriptsFilePath);
        return properties;
    }
}
