package com.whf.currentlimiting.controller;

import com.whf.currentlimiting.annotations.Limit;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author oyuoiud
 */
@RestController
public class LimitController {

    @Limit(period=10, count=3, key="hello")
    @RequestMapping("/")
    public String hello() {
        return "hello";
    }
}
