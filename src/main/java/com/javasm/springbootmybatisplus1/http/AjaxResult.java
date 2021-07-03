package com.javasm.springbootmybatisplus1.http;

import com.github.pagehelper.PageInfo;

import java.util.HashMap;

/**
 * @Author:yzf
 * @Version：1.0
 * @Date：2021/7/2-23:31
 * @Since:jdk1.8
 * @Description:TODO
 */
public class AjaxResult extends HashMap<String, Object> {
    private static final String STATUS = "status";
    private static final String MESSAGE = "message";
    private static final String DATA = "data";
    private static final String is_NextPage = "isNextPage";
    private static final String TOTAL = "total";


    private AjaxResult(ErrorEnum errorEnum) {
        this.put(STATUS,errorEnum.getStatus());
        this.put(MESSAGE,errorEnum.getMessage());
    }
    /**
     * 成功之后没有要返回的数据
     * @return
     */
    public static AjaxResult reDataPack(){
        return new AjaxResult(ErrorEnum.SUCCESS);
    }

    /**
     * 成功之后携带object
     * @param object
     * @return
     */
    public static AjaxResult reDataPack(Object object){
        AjaxResult success = AjaxResult.reDataPack();

        if(object instanceof PageInfo){
            success.put("is_NextPage",((PageInfo) object).isHasNextPage());
            success.put("TOTAL",((PageInfo) object).getTotal());
            success.put(AjaxResult.DATA,((PageInfo) object).getList());
            return success;
        }

        success.put(AjaxResult.DATA,object);
        return success;
    }

    /**
     * 其他状态码返回
     * @param returnStats
     * @return
     */
    public static AjaxResult reDataPack(ErrorEnum returnStats){
        return new AjaxResult(returnStats);
    }
}
