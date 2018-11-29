package com.aditiva.ISO8583.enums;

/**
 * @author aditiva
 */
public enum PC_TTC_100 {

    Authorization("00"),
    AuthorizationVoid("02"),
    Refund_Return("20"),
    Refund_Return_void("22"),
    BalanceInquiry("30");

    private final String code;

    PC_TTC_100(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
