package com.michaljach.jaz;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ThirdClass {


    public ThirdClass (ApplicationContext applicationContext){
        FirstClass firstClass = applicationContext.getBean("firstClass", FirstClass.class);
    }

}
