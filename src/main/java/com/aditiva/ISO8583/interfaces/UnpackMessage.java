package com.aditiva.ISO8583.interfaces;

/**
 * @author aditiva
 */
public interface UnpackMessage {

    UnpackMethods setMessage(byte[] message);
    UnpackMethods setMessage(String message);

}
