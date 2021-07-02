package com.javasm.springbootmybatisplus.service.base.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.javasm.springbootmybatisplus.mapper.base.MyBaseMapper;
import com.javasm.springbootmybatisplus.service.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

/**
 * @Author:yzf
 * @Version：1.0
 * @Date：2021/7/2-20:50
 * @Since:jdk1.8
 * @Description:TODO
 */
@Service
public class BaseServiceImpl<T> implements BaseService<T> {

    @Autowired
    MyBaseMapper<T> mapper;

    @Override
    public List<T> findAll() {
        List<T> ts = mapper.selectList(null);
        return ts;
    }

    @Override
    public List<T> findByCondition(Wrapper<T> wrapper) {
        List<T> ts = mapper.selectList(wrapper);
        return ts;
    }


    @Override
    public T findById(Serializable id) {
        T t = mapper.selectById(id);
        return t;
    }

    @Override
    public int saveEntity(T t) {
        int insert = mapper.insert(t);
        return insert;
    }

    @Override
    public int delEntityById(Serializable id) {
        int i = mapper.deleteById(id);
        return i;
    }

    @Override
    public int updateEntityById(T t) {
        int i = mapper.updateById(t);
        return i;
    }
}
