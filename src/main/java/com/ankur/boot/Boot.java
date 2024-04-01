package com.ankur.boot;

import com.ankur.domain.Employee;
import com.ankur.domain.Status;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

@SpringBootApplication
@ComponentScan(basePackages = "com.ankur")
public class Boot {
    public static void main(String[] args) {
        SpringApplication.run(Boot.class, args);
    }



}
