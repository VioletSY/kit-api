package com.kit.api.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author songyan
 * @date 2021/1/3 12:22
 * @desc sql工具类
 **/
public class SqlUtil {

    /**
     * 获取排序SQL片段
     * @param sorter
     * @return
     */
    public static String getSorterSql(String sorter) {
        AtomicReference<String> sorterSql = new AtomicReference<>("");
        if(!Validate.isNull(sorter)){
            JSONObject jsonObject = JSONObject.parseObject(sorter);
            jsonObject.forEach((key, value) -> {
                sorterSql.set("order by " + key + " " + (value + "").replace("descend","desc").replace("ascend","asc"));
            });
        }
        return sorterSql.get();
    }

    /**
     * 获取筛选SQL片段
     * @param filter
     * @return
     */
    public static String getFilterSql(String filter) {
        String filterSql = "";
        if(!Validate.isNull(filter)){
            JSONObject jsonObject = JSONObject.parseObject(filter);
            for (Object obj:jsonObject.keySet()) {
                String key = obj+"";
                String value = jsonObject.getString(key);
                if(!Validate.isNull(String.valueOf(value))){
                    String inSql = "(";
                    JSONArray inList = JSONArray.parseArray(String.valueOf(value));
                    for (Object item:inList) {
                        inSql +="'"+item+"',";
                    }
                    inSql= inSql.substring(0,inSql.length()-1);
                    inSql +=")";
                    filterSql +=key +" in "+ inSql;
                }
            }
        }
        return filterSql;
    }

    /**
     * 获取分页起始
     * @param current
     * @param pageSize
     * @return
     */
    public static int getStart(int current, int pageSize) {
        return pageSize*(current-1);
    }
}
