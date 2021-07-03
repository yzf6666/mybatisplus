package com.javasm.springbootmybatisplus1.controller;


import com.javasm.springbootmybatisplus1.http.AjaxResult;
import com.javasm.springbootmybatisplus1.service.IAdminService;
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
    private IAdminService iAdminService;

    @GetMapping("all")
    public AjaxResult getAll(){
        return AjaxResult.reDataPack(iAdminService.findAll());
    }

    @GetMapping("byId")
    public AjaxResult queryById(String id){
        return AjaxResult.reDataPack(iAdminService.findById(id));
    }

}
