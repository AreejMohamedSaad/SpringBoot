package com.h2demorest.demoh2rest.exceptions;

public class NotFound extends RuntimeException{
    public NotFound() {
    }

    public NotFound(String s) {
        super(s);
    }

    public NotFound(String s, Throwable throwable) {
        super(s, throwable);
    }
}
