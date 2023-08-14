package com.pw.db.solution.toolbox.service;

import com.pw.db.solution.toolbox.util.TestDataGenerator;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestDataService {

    public void generateTestData(int amount){
        TestDataGenerator.generateTestData(amount);
    }
}
