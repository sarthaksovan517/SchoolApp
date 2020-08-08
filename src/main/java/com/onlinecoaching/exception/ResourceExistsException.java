package com.onlinecoaching.exception;

public class ResourceExistsException extends RuntimeException {

    private String code;
    private String message;

    public ResourceExistsException(String message, String code) {
        super(message);
        this.code = code;
    }
}
