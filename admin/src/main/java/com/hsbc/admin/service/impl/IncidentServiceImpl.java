package com.hsbc.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hsbc.admin.dao.IncidentDao;
import com.hsbc.admin.entity.IncidentEntity;
import com.hsbc.admin.service.IncidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class IncidentServiceImpl extends ServiceImpl<IncidentDao, IncidentEntity> implements IncidentService {
    @Override
    public List<IncidentEntity> getAllIncidents() {
        return this.baseMapper.getList();
    }
}
