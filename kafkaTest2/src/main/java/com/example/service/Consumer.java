package com.example.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
	
	  private final Logger logger = LoggerFactory.getLogger(Consumer.class);
	  
	  @KafkaListener(topics = "users", groupId = "group_id") public void
	  consume(String message, String json) {
	  logger.info(String.format("$$ -> Consumed 1st server Message -> %s", message)); 
//	  logger.info(String.format("$$ -> Consumed json -> %s", json));
	  }
	 
}