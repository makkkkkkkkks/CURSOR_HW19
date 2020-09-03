package com.company;

import com.company.model.H2DaoImpl;
import com.company.сonfig.Config;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        var applicationContext = new AnnotationConfigApplicationContext(Config.class);
        applicationContext.getBean(H2DaoImpl.class);
        new H2DaoImpl().say();
    }
}

