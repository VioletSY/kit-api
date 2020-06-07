package com.kit.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.List;

/**
 * @author songyan
 * @date 2020/6/7 16:07
 * @desc 文章
 **/
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Article {

    /**
     * 主键id
     */
    private String gid;

    /**
     * 标题
     */
    private String title;

    /**
     * 注释
     */
    private String comments;

    /**
     * 语言主键
     */
    private String languageId;

    /**
     * 目录id
     */
    private String fid;

    /**
     * 用户主键
     */
    private String userId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 文章内容
     */
    private String content;

    /**
     * 标签列表
     */
    private List<ArticleTag> tagList;

    /**
     * 图片列表
     */
    private List<SystemFile> imageList;

    /**
     * 代码包
     */
    private SystemFile codePackage;

}
