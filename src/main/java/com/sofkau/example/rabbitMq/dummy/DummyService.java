package com.sofkau.example.rabbitMq.dummy;

import com.sofkau.example.rabbitMq.consumer.Consumer;
import com.sofkau.example.rabbitMq.publisher.Publisher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DummyService {

    private static final Logger log = LoggerFactory.getLogger(DummyService.class);

    @Autowired
    private Publisher publisher;

    public void sentToRabbit(String message){
        log.info("Message '{}' will be send...", message);
        this.publisher.send(message);
    }

}
