package com.micro.component;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * defined healthcheck
 *
 * Created by dongc on 15/12/16.
 */
@Component
public class CustomHealthCheckHandler implements HealthIndicator {

    @Override
    public Health health() {
        return Health.up().build();
    }
}
