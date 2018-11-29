package com.aditiva.ISO8583.interfaces;

import com.aditiva.ISO8583.enums.MESSAGE_FUNCTION;
import com.aditiva.ISO8583.enums.MESSAGE_ORIGIN;

/**
 * @author aditiva
 */
public interface MessagePacker<T> {

    ProcessCode<T> mti(MESSAGE_FUNCTION mFunction, MESSAGE_ORIGIN mOrigin);
    MessagePacker<T> setLeftPadding(char character);
    MessagePacker<T> setRightPadding(char character);
}
