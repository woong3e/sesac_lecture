package com.woong3e.exceptionhandler;

public class MemberNotFoundException extends RuntimeException{

    public MemberNotFoundException(String message){
        super(message);

    }
}
