package com.cf.cfApp.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Dzmitry Karayedau
 */
@Slf4j
@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String getProductByName() {
        log.info("Hello servlet triggered");
        return "Hello";
    }
}
