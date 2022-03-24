package com.example.nickchat.web;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {
    
    @MessageMapping
    public void sendMessage() {

    }
}
