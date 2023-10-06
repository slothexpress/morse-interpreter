package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MorseController {

    MorseService service;

    @Autowired
    public MorseController(MorseService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String hello() {
        return "HELLO SAMI";
    }

}
