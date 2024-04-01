package com.ankur.handlers;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class LowerCaseStringHandler {

    @Bean
    public Function<String,String> lowercase(){
        return (input)->input.toLowerCase();
    }
}
