package com.nqn.apideservico.exceptions;

import java.util.List;

public class ErrorResponse {
    private final int status;
    private final String error;
    private final String message;
    private final String path;
    private final List<String> details;

    public ErrorResponse(int status, String error, String message, String path, List<String> details) {
        this.status = status;
        this.error = error;
        this.message = message;
        this.path = path;
        this.details = details;
    }


    public ErrorResponse(int value, String reasonPhrase, String message, String requestURI) {
        this(value,message,reasonPhrase,requestURI,null);
    }

}
