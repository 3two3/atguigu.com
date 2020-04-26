package com.atguigu.gmall.ums.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall.ums.entity.Admin;
import com.atguigu.gmall.ums.mapper.AdminMapper;
import com.atguigu.gmall.ums.service.AdminService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;

/**
 * <p>
 * 后台用户表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-02-12
 */
@Component
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {

    @Autowired
    AdminMapper adminMapper;

    @Override
    public Admin login(String username, String password) {
        String s = DigestUtils.md5DigestAsHex(password.getBytes());
        QueryWrapper<Admin> wrapper = new QueryWrapper<Admin>().eq("username", username).eq("password", s);
        Admin admin = adminMapper.selectOne(wrapper);
        return admin;
    }

    /**
     * 获取用户详情
     * @param userName
     * @return
     */
    @Override
    public Admin getUserInfo(String userName) {

        return adminMapper.selectOne(new QueryWrapper<Admin>().eq("username",userName));
    }
}