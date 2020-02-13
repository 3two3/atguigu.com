package com.atguigu.gmall.cms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 帮助表
 * </p>
 *
 * @author Lfy
 * @since 2019-05-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("cms_help")
@ApiModel(value="Help对象", description="帮助表")
public class Help implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("category_id")
    private Long categoryId;

    @TableField("icon")
    private String icon;

    @TableField("title")
    private String title;

    @TableField("show_status")
    private Integer showStatus;

    @TableField("create_time")
    private Date createTime;

    @TableField("read_count")
    private Integer readCount;

    @TableField("content")
    private String content;


}
