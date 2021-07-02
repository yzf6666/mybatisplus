package com.javasm.springbootmybatisplus.service.impl;

import com.javasm.springbootmybatisplus.entity.Brand;
import com.javasm.springbootmybatisplus.mapper.BrandMapper;
import com.javasm.springbootmybatisplus.service.IBrandService;
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
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements IBrandService {

}
