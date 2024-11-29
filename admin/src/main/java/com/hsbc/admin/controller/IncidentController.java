package com.hsbc.admin.controller;

import com.hsbc.admin.entity.IncidentEntity;
import com.hsbc.admin.service.IncidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/incidents")
@CrossOrigin(origins = "http://localhost:3000")
public class IncidentController {
    @Autowired
    private IncidentService incidentService;

    @PostMapping("/add")
    public boolean addIncident(@RequestBody IncidentEntity incident) {
        try {
            incidentService.save(incident);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @PostMapping("/delete/{id}")
    public void deleteIncident(@PathVariable Long id) {
        incidentService.removeById(id);
    }

    @PutMapping("/update/{id}")
    public boolean updateIncident(@PathVariable Long id, @RequestBody IncidentEntity incident) {
        try {
            incidentService.updateById(incident);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @GetMapping("/list")
    public List<IncidentEntity> listAllIncident() {
        return incidentService.getAllIncidents();
    }
}
