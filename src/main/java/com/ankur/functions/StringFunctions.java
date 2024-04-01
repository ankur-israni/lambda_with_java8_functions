package com.ankur.functions;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class StringFunctions{

    @Bean
    public Function<String, String> toLowerCase() {
        System.out.println("StringFunctions.toLowerCase");
       // return String::toLowerCase;
        return (String input)->input.toLowerCase();
    }

    @Bean
    public Function<String, String> toUpperCase() {
        return String::toUpperCase;
    }

    @Bean
    public Function<String,String> reverse(){
        return (input) -> new StringBuilder(input).reverse().toString();
    }


}
