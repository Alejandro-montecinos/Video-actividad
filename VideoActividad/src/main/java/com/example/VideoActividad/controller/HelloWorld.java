package com.example.VideoActividad.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/operaciones")
public class HelloWorld {

    @GetMapping("/suma")
    public int suma(int num1, int num2){
        return num1 + num2;

    }

    @GetMapping("/resta")
    public int resta(int num1, int num2){
        return num1-num2;
    }



}
