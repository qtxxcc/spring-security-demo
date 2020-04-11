package com.example.web.wang.service;

import com.example.web.wang.dao.SysRoleMapper;
import com.example.web.wang.entity.SysRole;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SysRoleService {
    @Resource
    private SysRoleMapper roleMapper;

    public SysRole selectById(Integer id) {
        return roleMapper.selectById(id);
    }
}