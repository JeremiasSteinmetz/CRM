package com.goes.CRM.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class HealthCheckController {
    @GetMapping("/health-check")
    public String healthCheck(){
        String coracao = "\u2764\uFE0F";
        return "Vivi " + coracao;
    }
}
