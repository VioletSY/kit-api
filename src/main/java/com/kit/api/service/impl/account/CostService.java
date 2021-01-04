package com.kit.api.service.impl.account;

import com.kit.api.dao.account.CostDao;
import com.kit.api.model.ApiResultModel;
import com.kit.api.service.user.account.ICostService;
import com.kit.api.util.ApiResultUtil;
import com.kit.api.util.SqlUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author songyan
 * @date 2021/1/3 11:07
 * @desc 花费
 **/
@Service
public class CostService implements ICostService {
    
    @Autowired
    private CostDao costDao;

    /**
     * 获取列表
     * @param current
     * @param pageSize
     * @param costNumber
     * @param description
     * @param sorter
     * @param filter
     * @return
     */
    @Override
    public ApiResultModel getList(int current, int pageSize, String costNumber, String description, String sorter, String filter) {
        String sorterSql = SqlUtil.getSorterSql(sorter);
        String filterSql = SqlUtil.getFilterSql(filter);
        int start = SqlUtil.getStart(current,pageSize);
        return ApiResultUtil.success(costDao.getList(start,pageSize,costNumber,description,sorterSql,filterSql));
    }
}
