package com.hsbc.admin;

import com.hsbc.admin.entity.IncidentEntity;
import com.hsbc.admin.service.IncidentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TestIncidentService {
    @Autowired
    private IncidentService incidentService;

    @Test
    public void test() {
        long count = incidentService.count();
        System.out.println(count);
    }

    @Test
    public void listTest() {
        List<IncidentEntity> lst = incidentService.getAllIncidents();
        for (IncidentEntity entity : lst) {
            System.out.println(entity.getDescription());
        }
    }

    @Test
    public void addTest() {
        IncidentEntity incidentEntity = new IncidentEntity();
        incidentEntity.setDescription("testingContent");
        incidentEntity.setType(1);
        incidentEntity.setName("test1");
        if (incidentService.save(incidentEntity)) {
            System.out.println(incidentEntity.getId());
        } else {
            System.out.println("failed");
        }
    }

    @Test
    public void updateTest() {
        IncidentEntity incidentEntity = new IncidentEntity();
        incidentEntity.setId(1L);
        incidentEntity.setDescription("testing change of content");
        incidentEntity.setType(0);
        incidentEntity.setName("test2");
        if (incidentService.save(incidentEntity)) {
            System.out.println(incidentEntity.getDescription());
        } else {
            System.out.println("failed");
        }
    }

    @Test
    public void deleteTest() {
        if (incidentService.removeById(1L)) {
            System.out.println("success");
        } else {
            System.out.println("failed");
        }
    }
}
