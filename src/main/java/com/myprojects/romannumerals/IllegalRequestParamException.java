package com.myprojects.romannumerals;

/**
 * Custom Exception implementation for declaring illegal input parameters on the applications Endpoint Controller.
 */
public class IllegalRequestParamException extends IllegalArgumentException{

    public IllegalRequestParamException(String s) {
        super(s);
    }

}
