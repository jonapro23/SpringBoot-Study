package com.example.demo.Controlleer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping
    public String Controller() {
        return "seja bem vindo ao meu Spring boot Web API";

    }
}
