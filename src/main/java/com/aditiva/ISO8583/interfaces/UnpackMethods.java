package com.aditiva.ISO8583.interfaces;

import com.aditiva.ISO8583.entities.ISOMessage;
import com.aditiva.ISO8583.exceptions.ISOException;

/**
 * @author aditiva
 */
public interface UnpackMethods {

    ISOMessage build() throws ISOException;
}
