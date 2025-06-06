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

        switch (operacion) {
            case "sumar":
                return service.sumar(num1, num2, model);

            case "restar":
                return service.restar(num1, num2, model);

            case "multiplicar":
                return service.multiplicar(num1, num2, model);

            case "dividir":
                return service.dividir(num1, num2, model);

            default:
                model.addAttribute("error", "Operacion incorrecta");
                return "index";
        }

    }
}
