package com.ankur.functions;


import com.ankur.domain.Employee;
import com.ankur.domain.Status;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

@Component
public class EmployeeFunctions {

    private Map<Integer, Employee> db = new HashMap<>();

    public EmployeeFunctions() {
        db.put(1, new Employee(1, "com/ankur", "frisco"));
        db.put(2, new Employee(2, "ravi", "plano"));
        db.put(3, new Employee(3, "shankar", "addison"));
    }


    @Bean
    public Function<Employee, Status> add() {
        return (employee) -> {
            Function<Integer, Employee> findByIdFunction = findById();
            Employee e = findByIdFunction.apply(employee.getId());
            if (e == null) {
                db.put(employee.getId(), employee);
                return Status.SUCCESS;
            }
            return Status.FAILURE;
        };
    }

    @Bean
    public Function<Integer, Status> remove() {
        return (id) -> {
            Function<Integer, Employee> findByIdFunction = findById();
            Employee employee = findByIdFunction.apply(id);
            if (employee != null) {
                db.remove(employee.getId());
                return Status.SUCCESS;
            }
            return Status.FAILURE;
        };

    }

    @Bean
    public Supplier<List<Employee>> all() {
        return () -> {
            return db.values().stream().collect(Collectors.toList());
        };
    }

    public Function<Integer, Employee> findById() {
        return (id) -> {
            return db.get(id);
        };
    }

}
