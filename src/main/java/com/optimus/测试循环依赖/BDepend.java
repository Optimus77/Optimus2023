package com.optimus.测试循环依赖;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Async
public class BDepend {

    @Resource
    private AsyncDepend asyncDepend;

}
