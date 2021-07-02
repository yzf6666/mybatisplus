package com.javasm.springbootmybatisplus.controller;


import com.javasm.springbootmybatisplus.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author whl
 * @since 2021-07-02
 */
@RestController
@RequestMapping("admin")
public class AdminController {
    @Autowired
    public IAdminService iAdminService;

    @GetMapping("all")
    public Object getAll(){
        return iAdminService.findAll();
    }

}
