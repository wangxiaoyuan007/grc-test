package com.wxy.grpctest.controller;

import com.wxy.grpctest.service.GrpcService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private GrpcService grpcService;
    public HelloController(GrpcService grpcService) {
        this.grpcService = grpcService;
    }

    @GetMapping("/sayHello")
    public String sayHello(String message) {
        return grpcService.sayHello(message);
    }
}
