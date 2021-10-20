package com.ArturLabs.SpringwebMVC.rest;

@ControllerAdvice

public class ResourceAdvice {

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(JediNotFoundException.class)
    public void notFound () {
    }

}
