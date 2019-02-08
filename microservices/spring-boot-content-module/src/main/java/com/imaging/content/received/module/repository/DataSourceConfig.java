package com.imaging.content.received.module.repository;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by irichiez on 5/13/17.
 */
@Configuration
public class DataSourceConfig {

    /**
     * Two beans with 2 different profiles
     */

    @Bean(name = "datasource")
    @Profile("dev")
    DataSource devDataSource() {
        return new DataSource("e0-url", 9090);
    }

    @Bean(name = "datasource")
    @Profile("prod")
    DataSource prodDataSource() {
        return new DataSource("e3-url", 7070);
    }
}
