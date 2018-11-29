package com.aditiva.ISO8583.exceptions;

/**
 * @author aditiva
 */
public class ISOClientException extends Exception {

    public ISOClientException(String message) {
        super(message);
    }

    public ISOClientException(Exception e) {
        super(e);
    }
}
