package com.example.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
	
	
	  private final Logger logger = LoggerFactory.getLogger(Consumer.class);
	  
	  @KafkaListener(topics = "users2", groupId = "group_id") public void
	  consume(String message) {
	  logger.info(String.format("$$ -> Consumed 2nd server Message -> %s", message)); }
	 
	 
}