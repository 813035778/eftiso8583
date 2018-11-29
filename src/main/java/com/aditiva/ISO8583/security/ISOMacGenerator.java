package com.aditiva.ISO8583.security;

/**
 * ISOMacGenerator
 * @author aditiva
 */
public abstract class ISOMacGenerator {

    public abstract byte[] generate(byte[] data);
        
}