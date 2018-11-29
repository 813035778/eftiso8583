package com.aditiva.ISO8583.exceptions;

/**
 * @author aditiva
 */
public class ISOException extends Exception {

    public ISOException(String message) {
        super(message);
    }

    public ISOException(String message, Throwable cause) {
        super(message, cause);
    }
}
