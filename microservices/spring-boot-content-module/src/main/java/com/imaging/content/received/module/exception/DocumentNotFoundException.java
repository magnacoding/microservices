package com.imaging.content.received.module.exception;

import org.springframework.http.HttpStatus;

/**
 * Created by irichiez on 5/13/17.
 */

//@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="Document not found")
public class DocumentNotFoundException extends Exception {

    public static final int STATUS = HttpStatus.NOT_FOUND.value();

    public DocumentNotFoundException(long documentId) {
        super(STATUS + " The requested document id: " + documentId + " was not found. Please check request parameters...");
    }

    public DocumentNotFoundException(long documentId, Throwable cause) {
        super(STATUS + " The document " + documentId + " requested was not found. Please check request parameters...", cause);
    }

}
