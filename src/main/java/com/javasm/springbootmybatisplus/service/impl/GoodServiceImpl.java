package com.javasm.springbootmybatisplus.service.impl;

import com.javasm.springbootmybatisplus.entity.Good;
import com.javasm.springbootmybatisplus.mapper.GoodMapper;
import com.javasm.springbootmybatisplus.service.IGoodService;
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
public class GoodServiceImpl extends ServiceImpl<GoodMapper, Good> implements IGoodService {

}
