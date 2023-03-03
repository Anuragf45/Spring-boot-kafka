package com.example.Kafka.with.spring.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = "Topic1", groupId = "myGroup")
    public void consume(String message) throws Exception {

//        for(int i = 0; i<100;i++){
//            logger.info(String.format("Message received->" + message+" "+i));
//        }

    }
}