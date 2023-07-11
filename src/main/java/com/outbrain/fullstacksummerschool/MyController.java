package com.outbrain.fullstacksummerschool;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class MyController {

    @GetMapping("mojca") //localhost:8080/api/mojca
    public String testEndpoint() {
        return "Hello this is api/mojca with changes!!!sdgfrhzjtzuhj!";
    }

}
