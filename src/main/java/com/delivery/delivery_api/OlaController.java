package com.delivery.delivery_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OlaController {
    @GetMapping("/ola")
    public String dizerOla(){
        return "Ola mundo";
    }
}
