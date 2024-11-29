package com.hsbc.admin.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

@Data
@TableName("tbl_incident")
public class IncidentEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId
    private long id;

    private String name;

    private int type;

    private String createTime;

    private String updateTime;

    private String description;
}
