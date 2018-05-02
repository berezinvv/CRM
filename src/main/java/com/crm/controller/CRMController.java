package com.crm.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CRMController {

    @RequestMapping("/test")
    public String test() {
        return "Done";
    }
}
