package com.example.openshift.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {

    @RequestMapping("/hell")
    public String home() {
        return "Hello World - v3!";
    }

}
