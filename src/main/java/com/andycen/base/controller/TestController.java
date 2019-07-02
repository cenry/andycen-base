package com.andycen.base.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Andy Cen
 */
@RestController
public class TestController {
    @GetMapping(value = "/test")
    public String test() {
        return "ok";
    }
}
