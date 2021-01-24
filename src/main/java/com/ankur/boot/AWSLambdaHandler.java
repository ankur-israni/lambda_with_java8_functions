package com.ankur.boot;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;
import org.springframework.stereotype.Component;

@Component
public class AWSLambdaHandler extends SpringBootRequestHandler<APIGatewayProxyResponseEvent,APIGatewayProxyResponseEvent> {
}

