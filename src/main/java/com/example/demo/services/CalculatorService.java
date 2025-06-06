package com.example.demo.services;

import org.springframework.ui.Model;

public interface CalculatorService {
    String index();
    String sumar(int num1, int num2, Model model);
    String restar(int num1, int num2, Model model);
    String multiplicar(int num1, int num2, Model model);
    String dividir(int num1, int num2, Model model);

}
