package com.example.actuatorservice;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class DemoController {

    @GetMapping("test") //http://localhost:8080/api/test?name=blabla
    public String testEndpoint(@RequestParam String name) {
        return "Hello "+name;
    }

    @GetMapping("test2")
    public DemoType testEndpoint2() {
        return new DemoType("test", 123);
    }

    @GetMapping("test223545")
    public DemoType testEndpoint2ti() {
        return new DemoType("test", 12234);
    }

    @PostMapping("test3")
    public String testEndpoint3(@RequestBody DemoType input) {
        return input.getField1();
    }

    @GetMapping("error")
    public String error() {
        return "error!";
    }
}
