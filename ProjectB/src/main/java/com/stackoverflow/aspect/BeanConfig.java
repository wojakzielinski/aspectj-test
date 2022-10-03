package com.stackoverflow.aspect;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean
    public AccountInterface accountInterface(){
        return new Account();
    }
}
