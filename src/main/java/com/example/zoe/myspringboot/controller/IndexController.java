package com.example.zoe.myspringboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    Logger log = LoggerFactory.getLogger(this.getClass());
    @GetMapping("/")
    public String Index() {
        log.info("HELLO ZOE!");
        return "HELLO ZOE";
    }
}
