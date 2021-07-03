package com.javasm.springbootmybatisplus1.service.impl;

import com.javasm.springbootmybatisplus1.entity.Admin;
import com.javasm.springbootmybatisplus1.service.IAdminService;
import com.javasm.springbootmybatisplus1.service.base.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author whl
 * @since 2021-07-02
 */
@Service
@Transactional
public class AdminServiceImpl extends BaseServiceImpl<Admin> implements IAdminService{

}
