package com.kit.api.model.account;

import lombok.Data;

/**
 * @author songyan
 * @date 2021/1/3 11:27
 * @desc 花费详情
 **/
@Data
public class CostDetail {
    private String gid;
    private String costMoney;
    private String  surplus;
    private String  createId;
    private String  createTime;
    private String  updateId;
    private String  updateTime;
    private String  costNumber;
    private String  description;
}
