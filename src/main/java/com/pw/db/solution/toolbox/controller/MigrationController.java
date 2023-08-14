package com.pw.db.solution.toolbox.controller;

import com.pw.db.solution.toolbox.service.MigrationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MigrationController {
    private static final Logger logger = LoggerFactory.getLogger(MigrationController.class);

    @Autowired
    private MigrationService migrationService;

    @GetMapping("/repair")
    public String repair() {
        logger.info("Repair Start");
        migrationService.repair();
        return  "Repair Done";
    }
    @GetMapping("/migrate")
    public String migrate() {
        logger.info("Repair Start");
        migrationService.dbScriptsMigrate();
        return  "Migration Done";

    }
}
