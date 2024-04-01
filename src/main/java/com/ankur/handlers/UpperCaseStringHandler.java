package com.ankur.handlers;

import org.springframework.stereotype.Component;

import java.util.function.Function;

//Working on local
//Working on Aws
//Component is added so we can test locally
// curl -H "Content-Type: text/plain" localhost:4080/upperCaseStringHandler -d ankur - first letter is always lowercase when invoking from curl i.e. upperCaseStringHandler and not UpperCaseStringHandler
//AWS Lambda does not care about @Component tag, as we explicitly give the class and method names to execute.
@Component
public class UpperCaseStringHandler implements Function<String, String> {
    @Override
    public String apply(String input) {
        if (input != null) {
            return input.toUpperCase();
        }
        return input;
    }
}
