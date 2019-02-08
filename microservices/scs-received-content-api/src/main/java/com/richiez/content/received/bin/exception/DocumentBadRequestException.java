package com.richiez.content.received.bin.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by irichiez on 5/13/17.
 */
@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Document bad request")
public class DocumentBadRequestException extends Exception {

    public static final int STATUS = HttpStatus.BAD_REQUEST.value();

    public DocumentBadRequestException(String documentId) {
        super(STATUS + " Bad request document " + documentId + " . Please check request parameters...");
    }

    public DocumentBadRequestException(String documentId, Throwable cause) {
        super(STATUS + " ad request document " + documentId + " . Please check request parameters...", cause);
    }
}
