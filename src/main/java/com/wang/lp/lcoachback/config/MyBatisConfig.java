package com.wang.lp.lcoachback.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.wang.lp.lcoachback.mbg.mapper","com.wang.lp.lcoachback.dao"})
public class MyBatisConfig {
}
