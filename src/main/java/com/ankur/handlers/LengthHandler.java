package com.ankur.handlers;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import com.ankur.domain.LengthRequest;
import com.ankur.domain.LengthResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

//TODO: cannot read input. Partially working
@Component
public class LengthHandler implements Function<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent> {

    @Override
    public APIGatewayProxyResponseEvent apply(APIGatewayProxyRequestEvent apiGatewayRequest) {
        System.out.println("1...apply()");
        APIGatewayProxyResponseEvent apiGatewayResponse = new APIGatewayProxyResponseEvent();
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            System.out.println("2...apiGatewayRequest.getBody(): "+apiGatewayRequest.getBody());
            LengthRequest lengthRequest = objectMapper.readValue(apiGatewayRequest.getBody(), LengthRequest.class);
            apiGatewayResponse.setStatusCode(200);
            apiGatewayResponse.setHeaders(createHeaders());
            apiGatewayResponse.setBody(objectMapper.writeValueAsString(process(lengthRequest)));
            return apiGatewayResponse;
        } catch (JsonProcessingException e) {
            //e.printStackTrace();
            System.out.println("JsonProcessingException = "+e.getMessage());
            return new APIGatewayProxyResponseEvent().withStatusCode(500);
        }
    }

    private LengthResponse process(LengthRequest request) {
        System.out.println("process()");
        String name = StringUtils.trimToNull(request.getName());
        if(name!=null){
            return new LengthResponse(name.length());
        }
        return new LengthResponse(0);
    }

    private Map<String, String> createHeaders() {
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type","application/json");
        return headers;
    }
}
