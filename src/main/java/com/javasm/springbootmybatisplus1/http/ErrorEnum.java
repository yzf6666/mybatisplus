package com.javasm.springbootmybatisplus1.http;

/**
 * @Author:yzf
 * @Version：1.0
 * @Date：2021/7/2-23:27
 * @Since:jdk1.8
 * @Description:TODO 返回异常状态
 */
public enum  ErrorEnum {
    SUCCESS(20000,"请求成功"),
    ERROR(40000,"请求失败");
    private int status;
    private String message;
    private ErrorEnum(int status,String message){
        this.status = status;
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }
}
