package com.biglots.com.leetcode.service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.stereotype.Service;

@Service
public class CircuitBreakerService {

    @CircuitBreaker(name = "externalService", fallbackMethod = "fallbackResponse")
    public String callExternalService() {
        System.out.println("Calling external service...");
        if (Math.random() > 0.5) { // Simulating failure
            throw new RuntimeException("Service is down!");
        }
        return "Service Response!";
    }

    public String fallbackResponse(Exception e) {
        return "Fallback Response: Service Unavailable!";
    }

}
