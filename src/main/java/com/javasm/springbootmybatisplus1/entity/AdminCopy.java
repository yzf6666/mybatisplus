package com.javasm.springbootmybatisplus1.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author whl
 * @since 2021-07-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("base_admin_copy")
public class AdminCopy implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 管理员id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 管理员名称
     */
    private String adminName;

    /**
     * 管理员昵称
     */
    private String nickName;

    /**
     * 管理员性别 0 : 男   1：女     2： 表示未知
     */
    private Integer gender;

    /**
     * 管理员手机
     */
    private String adminPhone;

    /**
     * 管理员邮箱
     */
    private String adminEmail;

    /**
     * 管理员家住地址
     */
    private String adminAddress;

    /**
     * 管理员密码
     */
    private String adminPwd;

    /**
     * 管理员头像
     */
    private String adminAvatar;

    /**
     * 账户是否可用
     */
    private Boolean isEnable;

    /**
     * 是否是超级管理员
     */
    private Boolean isAdmin;

    /**
     * 所在部门
     */
    private Long deptId;

    /**
     * 创建者
     */
    private Long createBy;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 修改者
     */
    private Long updateBy;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;

    /**
     * 重置密码时间
     */
    private LocalDateTime pwdResetTime;


}
