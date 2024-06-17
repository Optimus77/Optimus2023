package com.optimus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring Boot启动类,定义了一个"/"访问接口
 */
@EnableAsync
@RestController
@SpringBootApplication(scanBasePackages = {"com.optimus.*"})
public class OptimusMain {

    @RequestMapping("/")
    String hello() {
        return "Hello Spring Boot!";
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(OptimusMain.class, args);

        // 输出类的数量和名称
//        int beanCount = context.getBeanDefinitionCount();
//        String[] beanNames = context.getBeanDefinitionNames();
//        System.out.println("Number of beans: " + beanCount);
//        for (String beanName : beanNames) {
//            System.out.println(beanName);
//        }
//
//        主import s = (主import)context.getBean("主import");
//        s.test();

        //打印当前环境
//        SpringApplication application = new SpringApplication(OptimusMain.class);
//        WebApplicationType webApplicationType = application.getWebApplicationType();
//        System.out.println(webApplicationType);
//
//        ApplicationContextFactory.DEFAULT.create(WebApplicationType.REACTIVE);

        System.out.println(context.getBeanFactory());

    }
}