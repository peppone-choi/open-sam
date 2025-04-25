package com.pepponechoi.opensam.config.route;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouteConfig {
    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder) {
        return builder.routes()
            .route("opensam-member", r -> r.path("/api/member/**").uri("lb://opensam-member"))
            .route("opensam-character", r -> r.path("/api/character/**").uri("lb://opensam-character"))
            .route("opensam-command", r -> r.path("/api/command/**").uri("lb://opensam-command"))
            .build();
    }
}
