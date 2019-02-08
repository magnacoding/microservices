package com.imaging.content.received.module.exception;

import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * Created by irichiez on 5/13/17.
 */
@JsonRootName(value = "Exception")
public class ErrorResponse {

    private String error;
    private int errorCode;
    private String errorDescription;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

}
