package com.health.healthcare.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class DonctorNotFoundException extends  RuntimeException{
    public DonctorNotFoundException(String message){
        super(message);
    }

}
