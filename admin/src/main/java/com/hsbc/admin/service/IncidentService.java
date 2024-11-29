package com.hsbc.admin.service;

import com.hsbc.admin.entity.IncidentEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface IncidentService extends IService<IncidentEntity> {

    List<IncidentEntity> getAllIncidents();
}
