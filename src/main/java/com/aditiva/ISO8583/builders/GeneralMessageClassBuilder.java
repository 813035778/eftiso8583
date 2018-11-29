package com.aditiva.ISO8583.builders;

import com.aditiva.ISO8583.builders.BaseMessageClassBuilder;

/**
 * Created by aditiva on 18/04/01.
 */
public class GeneralMessageClassBuilder extends BaseMessageClassBuilder<GeneralMessageClassBuilder> {

    public GeneralMessageClassBuilder(String version, String messageClass) {
        super(version, messageClass);
    }
}