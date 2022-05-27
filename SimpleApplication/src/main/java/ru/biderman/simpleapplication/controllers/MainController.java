package ru.biderman.simpleapplication.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping(value = "/health", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getHealth() {
        return "{\"status\": \"OK\"}";
    }
}
