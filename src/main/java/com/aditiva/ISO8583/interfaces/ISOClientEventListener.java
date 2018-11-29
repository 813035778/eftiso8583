package com.aditiva.ISO8583.interfaces;

/**
 * @author aditiva
 */
public interface ISOClientEventListener {

    void connecting();
    void connected();
    void connectionFailed();
    void connectionClosed();
    void disconnected();
    void beforeSendingMessage();
    void afterSendingMessage();
    void onReceiveData();
    void beforeReceiveResponse();
    void afterReceiveResponse();
}
