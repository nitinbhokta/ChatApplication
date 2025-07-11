package com.example.Chat.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChatMessage {

    private  long id;
    private String sender;
    private String content;

    public String getSender() {
        return sender;
    }

    public String getContent() {
        return content;
    }
}
