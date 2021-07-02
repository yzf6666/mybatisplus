package com.javasm.springbootmybatisplus.service.impl;

import com.javasm.springbootmybatisplus.entity.Admin;
import com.javasm.springbootmybatisplus.mapper.AdminMapper;
import com.javasm.springbootmybatisplus.service.IAdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author whl
 * @since 2021-07-02
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements IAdminService {

}
