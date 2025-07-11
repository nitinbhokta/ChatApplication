package com.example.Chat.Controller;

import com.example.Chat.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Chatcontroller {
    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")
    public ChatMessage sendMessage(@Payload ChatMessage message){
        System.out.println("🔁 Message received: " + message.getSender() + ": " + message.getContent());

        return message;
    }

    @GetMapping("chat")
    public  String chat(){
        return "chat";
    }
}
