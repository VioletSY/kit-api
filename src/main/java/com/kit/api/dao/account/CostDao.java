package com.kit.api.dao.account;

import com.kit.api.model.account.CostDetail;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author songyan
 * @date 2021/1/3 11:11
 * @desc 花费
 **/
public interface CostDao {

    /**
     * 分页查询列表
     * @param start
     * @param pageSize
     * @param costNumber
     * @param description
     * @param sorterSql
     * @param filterSql
     * @return
     */
    @Select("<script>select t.* from (" +
            "   select cost_number costNumber,cost_money costMoney,surplus,description,create_time createTime,type " +
            "       from cost_detail " +
            "       <where> " +
            "           <if test='costNumber != null and costNumber.length != 0'> and cost_number like concat('%',#{costNumber},'%')</if>" +
            "           <if test='description != null and description.length != 0'> and description like concat('%',#{description},'%')</if>" +
            "       </where>" +
            "       ) t " +
            "<where> ${filterSql} </where>" +
            " ${sorterSql} " +
            "limit ${start},${pageSize}</script>")
    List<CostDetail> getList(int start, int pageSize, String costNumber, String description, String sorterSql, String filterSql);
}
