package com.michaljach.jaz;

import org.springframework.stereotype.Component;

@Component
public class SecondClass {

    public SecondClass() {
        System.out.println("Second");
    }

    public void print() {
        System.out.println("whatever");
    }

    public void secondName() {
        System.out.println("component second");
    }
}
