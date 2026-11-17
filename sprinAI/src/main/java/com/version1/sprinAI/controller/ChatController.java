package com.version1.sprinAI.controller;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.version1.sprinAI.client.ChatClient;

@RestController
@RequestMapping("/api")
public class ChatController {

    private final ChatClient chatClient;

    public ChatController(ChatClient chatClient) {
        this.chatClient = chatClient;
    }

    // GET API - Test in browser
    @GetMapping("/chat")
    public ResponseEntity<Map<String, String>> chatFromBrowser(
            @RequestParam String message) {

        String response = chatClient.sendMessage(message);

        return ResponseEntity.ok(
                Map.of(
                        "question", message,
                        "answer", response
                )
        );
    }

    // POST API - Test using Postman
    @PostMapping("/chat")
    public ResponseEntity<Map<String, String>> chat(
            @RequestBody Map<String, String> request) {

        String message = request.get("message");

        String response = chatClient.sendMessage(message);

        return ResponseEntity.ok(
                Map.of(
                        "question", message,
                        "answer", response
                )
        );
    }
}