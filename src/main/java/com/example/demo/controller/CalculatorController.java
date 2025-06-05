package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CalculatorController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/calcular")
    public String calcular(@RequestParam int num1,
                           @RequestParam int num2,
                           @RequestParam String operacion,
                           Model model) {

        double resultado = 0;
        switch (operacion) {
            case "suma":
                resultado = num1 + num2;
                break;
            case "resta":
                resultado = num1 - num2;
                break;
            case "multiplicacion":
                resultado = num1 * num2;
                break;
            case "division":
                if (num2 != 0) {
                    resultado = (double) num1 / num2;
                } else {
                    model.addAttribute("error", "No se puede dividir por cero");
                    return "index";
                }
                break;
        }

        model.addAttribute("resultado", resultado);
        return "index";
    }
}
