package com.example.statisticback.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * dept
 * @author 
 */
@Data
public class Dept implements Serializable {
    private Integer id;

    private String departmentName;

    private static final long serialVersionUID = 1L;
}