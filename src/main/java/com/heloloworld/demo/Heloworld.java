package com.heloloworld.demo;

import com.heloloworld.demo.model.Message;
import com.heloloworld.demo.repo.MessageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Heloworld {

    @Autowired
    MessageRepo messageRepo;

    @GetMapping("/hello")
    public ModelAndView helloWorld() {
        String messageContent = "Hello, World! Helloooooo";
        Message message = new Message();
        message.setContent(messageContent);
        messageRepo.save(message);

        ModelAndView modelAndView = new ModelAndView("helloworld");
        modelAndView.addObject("message", messageContent);
        return modelAndView;
    }
}