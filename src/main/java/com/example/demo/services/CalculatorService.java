package com.example.demo.services;

import org.springframework.ui.Model;

public interface CalculatorService {
    String index();
    String calcular(int num1, int num2, String operacion, Model model);
}
