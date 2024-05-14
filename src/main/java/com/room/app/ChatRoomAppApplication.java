package com.room.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ChatRoomAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChatRoomAppApplication.class, args);
	}

}
