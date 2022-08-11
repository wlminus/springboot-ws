//package com.example.demosocket.ws;
//
//import org.springframework.beans.factory.InitializingBean;
//import org.springframework.messaging.simp.SimpMessagingTemplate;
//import org.springframework.stereotype.Service;
//
//import java.time.Duration;
//
//@Service
//public class ReactiveScheduledPushMessages implements InitializingBean {
//    private final SimpMessagingTemplate simpMessagingTemplate;
//
//    public ReactiveScheduledPushMessages(SimpMessagingTemplate simpMessagingTemplate) {
//        this.simpMessagingTemplate = simpMessagingTemplate;
//    }
//
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        Flux.interval(Duration.ofSeconds(4L))
//                .map((n) -> new OutputMessage(faker.backToTheFuture().character(), faker.backToTheFuture().quote(),
//                        new SimpleDateFormat("HH:mm").format(new Date())))
//                .subscribe(message -> simpMessagingTemplate.convertAndSend("/topic/pushmessages", message));
//    }
//}
