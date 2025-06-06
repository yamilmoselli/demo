package com.example.demo.controller;

import com.example.demo.services.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CalculatorController {
    
    @Autowired
    private CalculatorService service;

    @GetMapping("/")
    public String index() {
        return service.index();
    }

    @PostMapping("/calcular")
    public String calcular(@RequestParam int num1, @RequestParam int num2, @RequestParam String operacion, Model model) {
        return service.calcular(num1, num2, operacion, model);
    }
}
