package com.chenjl.token.common;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.UUID;

@Component
@EnableScheduling
public class SchedulingToken {

    private static String token;

    @Scheduled(cron = "0 0/5 * 1/1 * ?")
    public void getTokenFromUrl() {
        String token = UUID.randomUUID().toString();
        this.token = token;
    }

    @PostConstruct
    public void initToken() {
        String token = UUID.randomUUID().toString();
        this.token = token;
    }

    public static String getSchedulingToken() {
        return token;
    }
}
