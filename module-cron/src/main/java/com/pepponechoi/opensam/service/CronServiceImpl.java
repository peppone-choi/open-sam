package com.pepponechoi.opensam.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class CronServiceImpl implements CronService {

    @Override
    @Scheduled(fixedRate = 500)
    public void runCommand() {
        System.out.println("Running CronService");
    }
}
