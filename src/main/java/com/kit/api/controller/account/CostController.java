package com.kit.api.controller.account;

import com.kit.api.model.ApiResultModel;
import com.kit.api.service.user.account.ICostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author songyan
 * @date 2021/1/3 11:04
 * @desc 花费控制器
 **/
@RequestMapping("account/cost")
@Controller
public class CostController {

    @Autowired
    private ICostService costService;

    /**
     * 分页查询列表
     * @param current
     * @param pageSize
     * @param costNumber
     * @param description
     * @param sorter
     * @param filter
     * @return
     */
    @RequestMapping("list")
    @ResponseBody
    public ApiResultModel list(int current,int pageSize,String costNumber,String description,String sorter,String filter){
        return costService.getList(current,pageSize,costNumber,description,sorter,filter);
    }
}
