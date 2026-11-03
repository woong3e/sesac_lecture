package com.woong3e.restapi.section03.swagger;

public class SwaggerUserNotFoundException extends RuntimeException {

    public SwaggerUserNotFoundException(String message) {
        super(message);
    }
}
