package com.myprojects.romannumerals;

public class IllegalRequestParamException extends IllegalArgumentException{
    public IllegalRequestParamException() {
    }

    public IllegalRequestParamException(String s) {
        super(s);
    }

    public IllegalRequestParamException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalRequestParamException(Throwable cause) {
        super(cause);
    }
}
