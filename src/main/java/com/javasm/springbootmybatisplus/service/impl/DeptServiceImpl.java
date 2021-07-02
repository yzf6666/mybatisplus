package com.javasm.springbootmybatisplus.service.impl;

import com.javasm.springbootmybatisplus.entity.Dept;
import com.javasm.springbootmybatisplus.mapper.DeptMapper;
import com.javasm.springbootmybatisplus.service.IDeptService;
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
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements IDeptService {

}
