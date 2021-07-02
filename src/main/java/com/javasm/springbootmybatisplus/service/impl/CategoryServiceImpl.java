package com.javasm.springbootmybatisplus.service.impl;

import com.javasm.springbootmybatisplus.entity.Category;
import com.javasm.springbootmybatisplus.mapper.CategoryMapper;
import com.javasm.springbootmybatisplus.service.ICategoryService;
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
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements ICategoryService {

}
