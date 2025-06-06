package com.example.demo.services;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class CalculatorServiceImp implements CalculatorService {

    public String index() {
        return "index";
    }

    public String sumar(int num1, int num2, Model model) {
        double resultado = num1 + num2;
        model.addAttribute("resultado", resultado);
        return "index";
    }

    public String restar(int num1, int num2, Model model) {
        double resultado = num1 - num2;
        model.addAttribute("resultado", resultado);
        return "index";
    }

    public String multiplicar(int num1, int num2, Model model) {
        double resultado = num1 * num2;
        model.addAttribute("resultado", resultado);
        return "index";
    }

    public String dividir(int num1, int num2, Model model) {

        if (num2 != 0) {
            double resultado = (double) num1 / num2;
            model.addAttribute("resultado", resultado);
        } else {
            model.addAttribute("error", "No se puede dividir por cero");
        }
        return "index";
    }

}
