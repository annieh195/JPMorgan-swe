package com.jpmc.midascore.listener;

import com.jpmc.midascore.foundation.Transaction;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaTransactionListener {

    @KafkaListener(topics = "${general.kafka-topic}", groupId = "JPMorgan-swe")
    public void listen(Transaction data) {
        System.out.println("Received Transaction: " + data);
    }

}