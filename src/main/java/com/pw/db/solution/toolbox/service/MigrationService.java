package com.pw.db.solution.toolbox.service;

import org.flywaydb.core.Flyway;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;


@Service
public class MigrationService {

    private static final Logger logger = LoggerFactory.getLogger(MigrationService.class);

    @Autowired
    private Flyway flyway;

    @PostConstruct
    public void dbScriptsMigrate(){
        try {
            flyway.repair();
            flyway.migrate();
        } catch (Exception e){
            logger.error("DB Migration failed :", e.getMessage());
        }
    }

    public void repair() {
        try {
            flyway.repair();
        } catch (Exception e){
            logger.error("Repair failed :", e.getMessage());
        }
    }
}
