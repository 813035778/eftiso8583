
import com.aditiva.ISO8583.builders.ISOClientBuilder;
import com.aditiva.ISO8583.builders.ISOMessageBuilder;
import com.aditiva.ISO8583.entities.ISOMessage;
import com.aditiva.ISO8583.enums.FIELDS;
import com.aditiva.ISO8583.enums.MESSAGE_FUNCTION;
import com.aditiva.ISO8583.enums.MESSAGE_ORIGIN;
import com.aditiva.ISO8583.enums.VERSION;
import com.aditiva.ISO8583.exceptions.ISOClientException;
import com.aditiva.ISO8583.exceptions.ISOException;
import com.aditiva.ISO8583.interfaces.ISOClient;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Main {
    


    
    public static void main(String args[]) throws ISOException, ISOClientException, IOException {
 
        String HOST = args[0];
        int    PORT = Integer.parseInt(args[1]);
        
        
        Map<String,Object> data;
        
        
        ISOMessage isoMessage = ISOMessageBuilder.Packer(VERSION.V1987)
                .networkManagement()
                .mti(MESSAGE_FUNCTION.Request, MESSAGE_ORIGIN.Acquirer)
                .processCode("920000")
                .setField(FIELDS.F11_STAN,  "1")
                .setField(FIELDS.F12_LocalTime,  "023120")
                .setField(FIELDS.F13_LocalDate,  "0332")
                .setField(FIELDS.F24_NII_FunctionCode,  "333")
                .build();
     
        
        ISOClient client = ISOClientBuilder.createSocket(HOST, PORT)
                .build();
        
        client.connect();
        String response = Arrays.toString(client.sendMessageSync( isoMessage ));
        System.out.println("response = " + response);
        client.disconnect();
        
        System.out.println( isoMessage.toString() );
        
    }
    
    
}
