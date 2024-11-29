package com.hsbc.admin.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hsbc.admin.entity.IncidentEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IncidentDao extends BaseMapper<IncidentEntity> {
    List<IncidentEntity> getList();
}
