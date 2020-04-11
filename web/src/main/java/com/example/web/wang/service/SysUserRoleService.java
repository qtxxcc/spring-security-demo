package com.example.web.wang.service;

import com.example.web.wang.dao.SysUserRoleMapper;
import com.example.web.wang.entity.SysUserRole;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysUserRoleService {
    @Resource
    private SysUserRoleMapper userRoleMapper;

    public List<SysUserRole> listByUserId(Integer userId) {
        return userRoleMapper.listByUserId(userId);
    }
}