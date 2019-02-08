package com.imaging.content.received.module;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
@EnableConfigurationProperties
public class CoreApplication {

//    public static void main(String[] args) {
//
//        ApplicationContext ctx = SpringApplication.run(ScsReceivedCoreApplication.class, args);
//
//		String[] beans = ctx.getBeanDefinitionNames();
//        Arrays.sort(beans);
//        for(String bean : beans) {
//            System.out.println(bean);
//        }
//
////        DocumentConfig config = (DocumentConfig)ctx.getBean("documentConfig");
////        System.out.println(config.toString());
//
//        //DataSource datasource = (DataSource)ctx.getBean("datasource");
//        //System.out.println(datasource.toString());
//
//    }
}
