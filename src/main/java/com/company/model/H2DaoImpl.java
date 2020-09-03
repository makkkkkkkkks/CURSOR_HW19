package com.company.model;

import org.springframework.stereotype.Component;

@Component
public class H2DaoImpl {
    public void say(){
        System.out.println("H2DaoImpl bean has been created");
    }
}
