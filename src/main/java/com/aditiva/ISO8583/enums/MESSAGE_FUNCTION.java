package com.aditiva.ISO8583.enums;

/**
 * @author aditiva
 */
public enum MESSAGE_FUNCTION {

    Request("0"),
    Advice("2");

    private final String code;

    MESSAGE_FUNCTION(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

}
