package com.room.app.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.room.app.model.Message;

@RestController
public class MessageController {

	@MessageMapping("/message")
	@SendTo("/topic/return-to")
	public Message getContent(@RequestBody Message message) throws InterruptedException {
		Thread.sleep(200);
		return message;
	}
		
}
