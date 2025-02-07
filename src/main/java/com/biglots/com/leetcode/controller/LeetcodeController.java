package com.biglots.com.leetcode.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LeetcodeController {

    @RequestMapping(value = "/event/{name}", method = RequestMethod.GET)
    public String getEventCall(@PathVariable String name) {
        return name;
    }

}
