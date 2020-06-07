package com.kit.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * @author songyan
 * @date 2020/6/7 17:02
 * @desc 文章语言
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ArticleLanguage {

    /**
     * 主键Id
     */
    private String gid;

    /**
     * 语言名称
     */
    private String name;

    /**
     * 创建时间
     */
    private Date CreateTime;

    /**
     * 用户id
     */
    private String userId;
}
