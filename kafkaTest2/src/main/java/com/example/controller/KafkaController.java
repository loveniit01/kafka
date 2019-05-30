package com.example.controller;

import org.apache.kafka.clients.consumer.Consumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.Producer;

@RestController
@RequestMapping(value = "/kafka2")
public class KafkaController {
	/**
	 *  Reference from 
	 *  https://dzone.com/articles/magic-of-kafka-with-spring-boot 
	 *  
	 *  kafka reference from 
	 *  https://kafka.apache.org/quickstart
	 *  
	 */
	private final Producer producer;

	@Autowired
	public KafkaController(Producer producer) {
		this.producer = producer;
	}
	
	

	@PostMapping(value = "/publish")
	public void sendMessageToKafkaTopic(@RequestParam("message") String message) {
		this.producer.sendMessage(message);
	}
}
