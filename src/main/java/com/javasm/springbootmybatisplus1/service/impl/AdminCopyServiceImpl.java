package com.javasm.springbootmybatisplus1.service.impl;

import com.javasm.springbootmybatisplus1.entity.AdminCopy;
import com.javasm.springbootmybatisplus1.mapper.base.MyBaseMapper;
import com.javasm.springbootmybatisplus1.service.IAdminCopyService;
import com.javasm.springbootmybatisplus1.service.base.impl.BaseServiceImpl;
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
public class AdminCopyServiceImpl extends BaseServiceImpl<AdminCopy> implements IAdminCopyService {
    private MyBaseMapper<AdminCopy> mapper = getMyMapper();
}
