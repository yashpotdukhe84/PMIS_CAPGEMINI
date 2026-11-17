
package com.version1.sprinAI.client;

import org.springframework.stereotype.Service;
import org.springframework.ai.chat.client.ChatClient.Builder;

@Service
public class ChatClient {

    private final org.springframework.ai.chat.client.ChatClient chatClient;

    public ChatClient(Builder builder) {
        this.chatClient = builder.build();
    }

    public String sendMessage(String message) {

        return chatClient.prompt()
                .user(message)
                .call()
                .content();
    }
}
