package com.imaging.content.received.api;

import com.imaging.content.received.module.CoreApplication;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableConfigurationProperties
public class ApiApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .bannerMode(Banner.Mode.CONSOLE)
                .sources(CoreApplication.class, ApiApplication.class)
                .run(args);
    }

//    public static void main(String[] args) {
//
//        ApplicationContext ctx = SpringApplication.run(ScsReceivedContentApiApplication.class, args);
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
