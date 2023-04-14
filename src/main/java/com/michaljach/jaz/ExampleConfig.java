package com.michaljach.jaz;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ExampleConfig {

    @Bean
    public SimplePojo simplePojo() {
        return new SimplePojo();
    }

    @Bean
    public List<String> defaultData(){
        return List.of(
                "String 1",
                "String 2",
                "String 3",
                "String 4",
                "String 5"
        );
    }
}
