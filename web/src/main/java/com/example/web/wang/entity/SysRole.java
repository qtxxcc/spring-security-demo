package com.example.web.wang.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description
 * @Author mi
 * @Date 2020/1/17 14:36
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SysRole {
    static final long serialVersionUID = 1L;
    private Integer id;
    private String name;
}
