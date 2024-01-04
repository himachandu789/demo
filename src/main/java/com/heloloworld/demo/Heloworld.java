package com.heloloworld.demo;

import ch.qos.logback.core.model.Model;
import com.heloloworld.demo.model.Message;

import com.heloloworld.demo.repo.MessageRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Heloworld {

    @Autowired
    private MessageRepo messageRepo;

    @GetMapping("/hello")
    public ResponseEntity<String> helloWorld() {
        String messageContent = "Hello, World! Helloooooo";
        Message message = new Message();
        message.setContent(messageContent);
        messageRepo.save(message);

        return ResponseEntity.ok(messageContent);
    }
}