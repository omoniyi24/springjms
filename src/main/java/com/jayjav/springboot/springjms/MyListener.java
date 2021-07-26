package com.jayjav.springboot.springjms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @author OMONIYI ILESANMI
 */
@Component
public class MyListener {

    @JmsListener(destination = "${springjms.myQueue}")
    public void receive(String message){
        System.out.println("Message received =====> " + message);
    }
}
