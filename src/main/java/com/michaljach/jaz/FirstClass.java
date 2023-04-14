package com.michaljach.jaz;


import org.springframework.stereotype.Component;

@Component
public class FirstClass {

   private  SecondClass secondClass;

    public FirstClass(SecondClass secondClass) {
        System.out.println("First");
        secondClass.print();
        firstName();
        secondClass.secondName();
    }


    public void firstName() {
        System.out.println("component first");
    }

}
