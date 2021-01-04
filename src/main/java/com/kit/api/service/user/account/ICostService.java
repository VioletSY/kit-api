package com.kit.api.service.user.account;

import com.kit.api.model.ApiResultModel;

/**
 * @author songyan
 * @date 2021/1/3 11:07
 * @desc 花费
 **/
public interface ICostService {

    /**
     * 获取列表
     * @return
     * @param current
     * @param pageSize
     * @param costNumber
     * @param description
     * @param sorter
     * @param filter
     */
    ApiResultModel getList(int current, int pageSize, String costNumber, String description, String sorter, String filter);
}
