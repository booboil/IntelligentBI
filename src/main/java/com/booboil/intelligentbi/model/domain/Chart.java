package com.booboil.intelligentbi.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 图表信息表
 * @TableName chart
 */
@TableName(value ="chart")
@Data
public class Chart implements Serializable {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 分析目标
     */
    @TableField(value = "goal")
    private String goal;

    /**
     * 图表名称
     */
    @TableField(value = "chartName")
    private String chartName;

    /**
     * 图表信息
     */
    @TableField(value = "chatDate")
    private String chatDate;

    /**
     * 图表类型
     */
    @TableField(value = "chartType")
    private String chartType;

    /**
     * 生成的图表信息
     */
    @TableField(value = "genChart")
    private String genChart;

    /**
     * 生成的分析结论
     */
    @TableField(value = "getResult")
    private String getResult;

    /**
     * 创建图表用户id
     */
    @TableField(value = "userId")
    private String userId;

    /**
     * 创建时间
     */
    @TableField(value = "createTime")
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(value = "updateTime")
    private Date updateTime;

    /**
     * 是否删除
     */
    @TableField(value = "isDelete")
    private Integer isDelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}