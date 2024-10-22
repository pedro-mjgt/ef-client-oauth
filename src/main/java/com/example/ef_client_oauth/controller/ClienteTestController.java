package com.example.ef_client_oauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class ClienteTestController {

    @GetMapping("/public")
    public String publicApi() {
        return "Esta API es pública";
    }

    @GetMapping("/private")
    public String privateApi() {
        return "Esta API es privada.";
    }

}
