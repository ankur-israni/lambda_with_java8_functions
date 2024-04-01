package com.ankur.todo_and_delete;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import com.ankur.domain.Employee;
import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;
import org.springframework.stereotype.Component;

import java.util.function.Function;

//TODO: Partially working, cannot read from input yet when deployed on aws lambda.
//@Component
public class LengthHandler implements Function<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent> {
    @Override
    public APIGatewayProxyResponseEvent apply(APIGatewayProxyRequestEvent request) {
        System.out.println("Length Function > apply");
       APIGatewayProxyResponseEvent response = new APIGatewayProxyResponseEvent();
       String input = request.getBody();
       System.out.println("Length Function apply > input = "+input);
       response.setBody(length(input).toString());

       response.setStatusCode(200);

       return response;
    }


    private Integer length(String input){
        if(input==null) return 0;
        return input.length();
    }
}
