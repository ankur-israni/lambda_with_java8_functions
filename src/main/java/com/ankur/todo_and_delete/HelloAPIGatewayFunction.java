package com.ankur.todo_and_delete;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import org.springframework.stereotype.Component;

import java.util.function.Function;

//TODO : Delete this later when we figure what this class is really for?
@Deprecated
@Component
public class HelloAPIGatewayFunction implements Function<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent> {
    @Override
    public APIGatewayProxyResponseEvent apply(APIGatewayProxyRequestEvent input) {
        APIGatewayProxyResponseEvent responseEvent = new APIGatewayProxyResponseEvent();
        responseEvent.setStatusCode(200);
        responseEvent.setBody("Hello! Reached the Spring Cloud Function with message: " + input.getBody());
        return responseEvent;
    }
}
