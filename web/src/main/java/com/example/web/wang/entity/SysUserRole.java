package com.example.web.wang.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description
 * @Author mi
 * @Date 2020/1/17 14:37
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SysUserRole {
    static final long serialVersionUID = 1L;
    private Integer userId;
    private Integer roleId;
}
