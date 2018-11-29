package com.aditiva.ISO8583.enums;

/**
 * @author aditiva
 */
public enum MESSAGE_ORIGIN {

    Acquirer("0");

    private final String code;

    MESSAGE_ORIGIN(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
