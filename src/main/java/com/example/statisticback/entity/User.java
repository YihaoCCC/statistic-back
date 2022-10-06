package com.example.statisticback.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * user
 * @author 
 */
@Data
public class User implements Serializable {
    private Integer id;

    private String username;

    private String password;

    private Integer departmentId;

    private static final long serialVersionUID = 1L;
}