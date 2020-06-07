package com.kit.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * @author songyan
 * @date 2020/6/7 17:00
 * @desc 文章目录
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ArticleFolder {

    /**
     * 主键
     */
    private String gid;

    /**
     * 名称
     */
    private String name;

    /**
     * 注释
     */
    private String comment;

    /**
     * 上级id(顶层Pid为-1)
     */
    private String pid;

    /**
     * 用户id
     */
    private String userId;

    /**
     * 创建时间
     */
    private Date createDate;

}
