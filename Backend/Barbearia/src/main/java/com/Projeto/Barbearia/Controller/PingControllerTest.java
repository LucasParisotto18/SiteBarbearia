package com.Projeto.Barbearia.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingControllerTest {
    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }
}
