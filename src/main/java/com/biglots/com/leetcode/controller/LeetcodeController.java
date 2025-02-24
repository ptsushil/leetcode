package com.biglots.com.leetcode.controller;

import com.biglots.com.leetcode.service.CircuitBreakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LeetcodeController {

    @Autowired
    CircuitBreakerService circuitBreakerService;
    @RequestMapping(value = "/event/{name}", method = RequestMethod.GET)
    public String getEventCall(@PathVariable String name) {
        return name;
    }


    @RequestMapping(value = "/circuitbreaker/{name}", method = RequestMethod.GET)
    public String callExternalServiceCircuitBreaker(@PathVariable String name) {

        return circuitBreakerService.callExternalService();
    }

}
