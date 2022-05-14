package app.flipn.airqualitykafkaconsumer.service;

import app.flipn.airqualitykafkaconsumer.model.Observation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

/**
 * service for kafka messages
 */
@Service
public class KafkaService {
    private static final Logger log = LoggerFactory.getLogger(KafkaService.class);

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @KafkaListener(topics = "airqualitykafka2",  groupId = "airqualitykafkareader" )
    public void listenWithHeaders(@Payload String message) {
        log.info("KAFKA RECEIVED: " + message.toString());
    }
}