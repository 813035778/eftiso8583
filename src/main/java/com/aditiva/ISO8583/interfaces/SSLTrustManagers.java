package com.aditiva.ISO8583.interfaces;

import com.aditiva.ISO8583.builders.ISOClientBuilder;

import javax.net.ssl.TrustManager;

/**
 * @author aditiva
 */
public interface SSLTrustManagers
{
    ISOClientBuilder.ClientBuilder setTrustManagers(TrustManager[] trustManagers);
}