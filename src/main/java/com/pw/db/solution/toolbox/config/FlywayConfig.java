package com.pw.db.solution.toolbox.config;


import org.flywaydb.core.Flyway;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FlywayConfig {

    Flyway flyway(FlywayProperties flywayProperties) {
        return Flyway.configure()
//                .callbacks()
                .baselineOnMigrate(true)
                .configuration(flywayProperties.getProperties())
                .createSchemas(true)
                .outOfOrder(true)
                .load();
    }
}
