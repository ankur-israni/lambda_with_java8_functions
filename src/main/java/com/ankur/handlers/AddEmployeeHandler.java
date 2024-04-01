package com.ankur.handlers;

import com.amazonaws.services.lambda.runtime.Context;
import com.ankur.domain.Employee;
import com.ankur.domain.Status;
import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

//Partially working. Does not show the newly added employee
@Component
public class AddEmployeeHandler extends SpringBootRequestHandler<Employee, List<Employee>> {

    private Map<Integer, Employee> db = new HashMap<>();

    public AddEmployeeHandler(){
        db.put(1, new Employee(1, "ankur", "frisco"));
        db.put(2, new Employee(2, "ravi", "plano"));
        db.put(3, new Employee(3, "shankar", "addison"));
    }

    @Override
    public List<Employee> handleRequest(Employee employee, Context context) {
        Employee emp = findById().apply(employee.getId());
        if(emp==null){
            db.put(employee.getId(),employee);
        }
        return all().get().stream().collect(Collectors.toList());
    }

    private Supplier<List<Employee>> all() {
        return () -> {
            return db.values().stream().collect(Collectors.toList());
        };
    }

    private Function<Integer, Employee> findById() {
        return (id) -> {
            return db.get(id);
        };
    }
}
