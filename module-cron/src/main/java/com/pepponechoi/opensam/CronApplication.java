package com.pepponechoi.opensam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(scanBasePackages = {"com.pepponechoi.opensam"})
@EnableJpaAuditing
@EnableScheduling
public class CronApplication {

    public static void main(String[] args) {
        SpringApplication.run(CronApplication.class, args);
    }
}
