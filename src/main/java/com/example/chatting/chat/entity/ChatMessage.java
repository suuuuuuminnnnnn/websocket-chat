package com.example.chatting.chat.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ChatMessage {
    private MessageType type;
    private String sender;
    private String roomId;
    private String message;

    public void setJoinMessage() {
        this.message = "[ " + MessageType.ENTER + " ] " + this.sender;
    }

    public enum MessageType {
        ENTER, EXIT, TEXT, IMAGE;
    }
}
