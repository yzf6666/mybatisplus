package com.javasm.springbootmybatisplus1.service.base;

import java.io.Serializable;
import com.baomidou.mybatisplus.core.conditions.Wrapper;

import java.util.List;

/**
 * @Author:yzf
 * @Version：1.0
 * @Date：2021/7/2-20:45
 * @Since:jdk1.8
 * @Description:TODO
 */
public interface BaseService<T>  {

    List<T> findAll();

    List<T> findByCondition(Wrapper<T> wrapper);

    T findById(Serializable id);



    int saveEntity(T t);


    int delEntityById(Serializable id);


    int updateEntityById(T t);




}
