package com.sofkau.example.rabbitMq.consumer;

import com.sofkau.example.rabbitMq.dummy.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    private static final Logger log = LoggerFactory.getLogger(Consumer.class);

    @RabbitListener(queues = {"${example.queue.name}"})
    public void receive(@Payload String message){

        log.info("Mensaje recibido: {}", message);
        delay();
    }

    private void delay(){
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
