package com.kit.api.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author songyan
 * @date 2020/12/26 14:30
 * @desc 数据库配置文件
 **/
@Configuration
@MapperScan(basePackages = "com.kit.api.dao")
public class DataBaseConfig {

    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean(initMethod = "init", destroyMethod = "close", name = "dataSource")
    public DruidDataSource dataSource() {
        return new DruidDataSource();
    }

}
