package com.optimus.测试循环依赖;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ADepend {

    @Resource
    private BDepend bDepend;


}
