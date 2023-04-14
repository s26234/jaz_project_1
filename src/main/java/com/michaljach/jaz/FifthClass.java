package com.michaljach.jaz;

import org.springframework.stereotype.Component;

@Component
public class FifthClass {
    public FifthClass (CustomProperties customProperties) {
        System.out.println(customProperties.getLoginurl());
        System.out.println(customProperties.getCredentials().getUser());
        System.out.println(customProperties.getCredentials().getPassword());
    }
}
