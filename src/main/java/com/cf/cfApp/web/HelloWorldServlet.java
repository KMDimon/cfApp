package com.cf.cfApp.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;

/**
 * @author Dzmitry Karayedau
 */
@RestController
public class HelloWorldServlet extends HttpServlet {

    @GetMapping("/hello")
    public String getProductByName() {

        return "Hello";
    }
}
