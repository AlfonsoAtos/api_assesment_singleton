package com.Assessment.Users_WS.services;

/**
 * This singleton works for every response with no errors
 */
public class ErrorFalseMessageSingleton {

    private static ErrorFalseMessageSingleton instance;
    private static String message = "Working...";
    private static boolean error = false;
    private static Integer code = 200;

    private ErrorFalseMessageSingleton() {

    }

    public static ErrorFalseMessageSingleton getInstance() {
        if (instance == null) {
            instance = new ErrorFalseMessageSingleton();
        }
        return instance;
    }

    public void setInstance(ErrorFalseMessageSingleton instance) {
        ErrorFalseMessageSingleton.instance = instance;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        ErrorFalseMessageSingleton.message = message;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        ErrorFalseMessageSingleton.error = error;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        ErrorFalseMessageSingleton.code = code;
    }

}
