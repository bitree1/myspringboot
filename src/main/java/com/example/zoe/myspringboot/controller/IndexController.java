package com.example.zoe.myspringboot.controller;

import com.example.zoe.myspringboot.utils.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


@RestController
public class IndexController {
    Logger log = LoggerFactory.getLogger(this.getClass());
    @GetMapping("/")
    public String Index() {
        log.info("HELLO ZOE!");
        log.info("HELLO ZOE!");
        return "HELLO ZOE";
    }

    @GetMapping("/index")
    public String Index1() {
        log.info("HELLO index!");
        String Date = DateUtils.DateFormtString(new Date());
        return Date;
    }
}
