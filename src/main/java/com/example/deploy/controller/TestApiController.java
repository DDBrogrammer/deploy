package com.example.deploy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController
@RequestMapping(value="deploy")
public class TestApiController {
    @GetMapping(value="/{name}")
    public String helloGET(
            @PathVariable("name") String name) {
        return String.format("{\"message\":\"Hello %s\"}",name);
    }
}
