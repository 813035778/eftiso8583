package com.aditiva.ISO8583.interfaces;

import java.math.BigDecimal;

/**
 * @author aditiva
 */
public interface Financial<T> {


    DataElement<T> setAmount(BigDecimal amount);
}
