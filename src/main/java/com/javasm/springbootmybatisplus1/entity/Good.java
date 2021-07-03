package com.javasm.springbootmybatisplus1.entity;

import java.math.BigDecimal;
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
@TableName("base_good")
public class Good implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 商品Id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 商品名称
     */
    private String goodName;

    /**
     * 商品价格
     */
    private BigDecimal goodPrice;

    /**
     * 商品描述
     */
    private String goodDesc;

    /**
     * 商品页面静态化使用的 
     */
    private String goodContent;

    /**
     * 商品图片
     */
    private String goodImg;

    /**
     * 品牌id
     */
    private Long brandId;

    /**
     * 一级分类ID
     */
    private Long firstCategoryId;

    /**
     * 二级分类ID
     */
    private Long secondCategoryId;

    /**
     * 三级分类id
     */
    private Long threeCategoryId;

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


}
