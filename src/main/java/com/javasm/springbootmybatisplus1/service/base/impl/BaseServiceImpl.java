package com.javasm.springbootmybatisplus1.service.base.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.javasm.springbootmybatisplus1.mapper.base.MyBaseMapper;
import com.javasm.springbootmybatisplus1.service.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * @Author:yzf
 * @Version：1.0
 * @Date：2021/7/2-20:50
 * @Since:jdk1.8
 * @Description:TODO
 */
public class BaseServiceImpl<T> implements BaseService<T> {

    @Autowired
    private MyBaseMapper<T> myBaseMapper;

    protected MyBaseMapper<T> getMyMapper() {
        return myBaseMapper;
    }

    @Override
    public List<T> findAll() {
        List<T> ts = myBaseMapper.selectList(null);
        return ts;
    }

    @Override
    public List<T> findByCondition(Wrapper<T> wrapper) {
        List<T> ts = myBaseMapper.selectList(wrapper);
        return ts;
    }


    @Override
    public T findById(Serializable id) {
        T t = myBaseMapper.selectById(id);
        return t;
    }

    @Override
    public int saveEntity(T t) {
        int insert = myBaseMapper.insert(t);
        return insert;
    }

    @Override
    public int delEntityById(Serializable id) {
        int i = myBaseMapper.deleteById(id);
        return i;
    }

    @Override
    public int updateEntityById(T t) {
        int i = myBaseMapper.updateById(t);
        return i;
    }
}
