package com.hsbc.admin;

import com.hsbc.admin.service.IncidentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestIncidentService {
    @Autowired
    private IncidentService incidentService;

    @Test
    public void test() {
        long count = incidentService.count();
        System.out.println(count);
    }
}
