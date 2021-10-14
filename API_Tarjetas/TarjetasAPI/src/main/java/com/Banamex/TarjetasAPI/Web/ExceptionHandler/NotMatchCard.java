package com.Banamex.TarjetasAPI.Web.ExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
public class NotMatchCard extends RuntimeException{
    public NotMatchCard(String message) {
        super(message);
    }
}
