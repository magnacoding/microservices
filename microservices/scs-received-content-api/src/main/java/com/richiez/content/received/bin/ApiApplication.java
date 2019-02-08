package com.richiez.content.received.bin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class ApiApplication {

    public static void main(String[] args) {

        //ApplicationContext ctx =
        SpringApplication.run(ApiApplication.class, args);

//		String[] beans = ctx.getBeanDefinitionNames();
//        Arrays.sort(beans);
//        for(String bean : beans) {
//            System.out.println(bean);
//        }
//
//        DocumentConfig config = (DocumentConfig)ctx.getBean("documentConfig");
//        System.out.println(config.toString());

        //DataSource datasource = (DataSource)ctx.getBean("datasource");
        //System.out.println(datasource.toString());

    }
}
