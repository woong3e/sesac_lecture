package com.woong3e.section02.userException.exception;

public class PriceNegativeException extends Exception{
    public PriceNegativeException(String message) {
        super(message);
    }
}
