package com.optimus.测试import;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import javax.annotation.Resource;

@Configuration
@Import(被import.class)
public class 主import {

    @Resource
    private 被import sb;

    public void test(){
        sb.print();
    }

}
