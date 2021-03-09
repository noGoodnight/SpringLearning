package com.mjh.config;

import com.mjh.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.mjh")
public class AppConfig {
    @Bean
    public User user(){
        return new User();
    }
}
