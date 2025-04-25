package com.pepponechoi.opensam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication(scanBasePackages = {"com.pepponechoi.opensam"})
@EnableJpaAuditing
public class OpenSamApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenSamApplication.class, args);
    }
}
