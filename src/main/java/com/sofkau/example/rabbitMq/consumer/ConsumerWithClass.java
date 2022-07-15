package com.sofkau.example.rabbitMq.consumer;

import com.sofkau.example.rabbitMq.dummy.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class ConsumerWithClass {

    private static final Logger log = LoggerFactory.getLogger(ConsumerWithClass.class);

    @RabbitListener(queues = {"${example.queue.name}"})
    public void receive(@Payload Data message){

        log.info("Mensaje recibido: {}", message);

    }

    private void delay(){
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
