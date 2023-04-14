package com.michaljach.jaz;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FourthClass {

    public FourthClass(@Value("${my.custom.property:my default value}") String valueFromProperties) {
        System.out.println(valueFromProperties);

    }
}
