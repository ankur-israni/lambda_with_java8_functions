package com.ankur.todo_and_delete;

import com.amazonaws.services.lambda.runtime.Context;
import com.ankur.domain.Employee;
import com.ankur.domain.Status;
import org.springframework.cloud.function.adapter.aws.SpringBootApiGatewayRequestHandler;
import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

@Deprecated
//configured for : Status add(Employee)
public class EmployeeHandler extends SpringBootRequestHandler<Employee,Status> {



    @Override
    public Object handleRequest(Employee event, Context context) {
        return super.handleRequest(event, context);
    }
}
