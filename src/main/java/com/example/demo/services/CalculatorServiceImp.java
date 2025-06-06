package com.example.demo.services;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class CalculatorServiceImp implements CalculatorService {

    public String index() {
        return "index";
    }


    public String calcular(int num1, int num2, String operacion, Model model) {

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
