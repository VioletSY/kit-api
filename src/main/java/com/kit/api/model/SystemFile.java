package com.kit.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * @author songyan
 * @date 2020/6/7 17:01
 * @desc 附件
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class SystemFile {

    /**
     * 主键
     */
    private String gid;

    /**
     * 文件地址
     */
    private String filePath;

    /**
     * 文件名称
     */
    private String fileName;

    /**
     * 文章id
     */
    private String aid;

    /**
     * 附件类型
     */
    private String fileType;

    /**
     * 创建时间
     */
    private Date createTime;
}
