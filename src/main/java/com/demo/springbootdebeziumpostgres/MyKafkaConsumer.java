package com.demo.springbootdebeziumpostgres;

import com.demo.springbootdebeziumpostgres.event.Event;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class MyKafkaConsumer {


    @KafkaListener(topics = "store_topic", groupId = "groupId")
    public void consumePaymentEvents(Event event)  {
        log.info("received event: {}", event);
    }

}
