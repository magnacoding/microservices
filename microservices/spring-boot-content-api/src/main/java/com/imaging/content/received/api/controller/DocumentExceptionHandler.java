package com.imaging.content.received.api.controller;

import com.imaging.content.received.module.exception.DocumentBadRequestException;
import com.imaging.content.received.module.exception.DocumentNotFoundException;
import com.imaging.content.received.module.exception.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Created by irichiez on 5/13/17.
 */
@ControllerAdvice
public class DocumentExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> exceptionHandler(Exception e) {
        ErrorResponse error = new ErrorResponse();
        error.setError(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase());
        error.setErrorCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
        error.setErrorDescription(e.getMessage());
        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);

    }

    @ExceptionHandler(DocumentNotFoundException.class)
    public ResponseEntity<ErrorResponse> DocumentNotFoundExceptionHandler(DocumentNotFoundException e) {
        ErrorResponse error = new ErrorResponse();
        error.setError(HttpStatus.NOT_FOUND.getReasonPhrase());
        error.setErrorCode(HttpStatus.NOT_FOUND.value());
        error.setErrorDescription(e.getMessage());
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);

    }

    @ExceptionHandler(DocumentBadRequestException.class)
    public ResponseEntity<ErrorResponse> DocumentBadRequestExceptionHandler(DocumentBadRequestException e) {
        ErrorResponse error = new ErrorResponse();
        error.setError(HttpStatus.BAD_REQUEST.getReasonPhrase());
        error.setErrorCode(HttpStatus.BAD_REQUEST.value());
        error.setErrorDescription(e.getMessage());
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);

    }

}
