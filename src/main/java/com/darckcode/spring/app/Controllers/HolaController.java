package com.darckcode.spring.app.Controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController

public class HolaController {
    @GetMapping("/")
    String hola() {
        return "Hola Mundo  con DarkCode";
    }
    
    
}
