package com.company.сonfig;

import com.company.model.H2;
import com.company.model.H2DaoImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(H2.class)
public class Config{
    @Bean
    public H2DaoImpl h2Bean() {
        return new H2DaoImpl();
    }
}