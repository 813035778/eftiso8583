package com.aditiva.ISO8583.interfaces;

import javax.net.ssl.KeyManager;

/**
 * @author aditiva
 */
public interface SSLKeyManagers
{
    SSLTrustManagers setKeyManagers(KeyManager[] keyManagers);
}