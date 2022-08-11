package com.example.demosocket.ws;

import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class ScheduledPushMessages {
    private final SimpMessagingTemplate simpMessagingTemplate;

    public ScheduledPushMessages(SimpMessagingTemplate simpMessagingTemplate) {
        this.simpMessagingTemplate = simpMessagingTemplate;
    }

    @Scheduled(fixedRate = 5000)
    public void sendMessage() {
        final String time = new SimpleDateFormat("HH:mm").format(new Date());
        simpMessagingTemplate.convertAndSend("/topic/pushmessages",
                new OutputMessage("Chuck Norris", "Hello", time));
    }
}
