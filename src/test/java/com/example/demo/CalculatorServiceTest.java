package com.example.demo;


import com.example.demo.services.CalculatorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;

public class CalculatorServiceTest {

    CalculatorService service = new CalculatorService();
    Model model = new ExtendedModelMap();

    @Test
    public void testSumar1() {
        service.sumar(0, 0, model);
        Assertions.assertEquals(9.0, model.getAttribute("resultado"));
    }

    @Test
    public void testSumar2() {
        service.sumar(5, 0, model);
        Assertions.assertEquals(5.0, model.getAttribute("resultado"));
    }

    @Test
    public void testSumar3() {
        service.sumar(8, 4, model);
        Assertions.assertEquals(12.0, model.getAttribute("resultado"));
    }

    @Test
    public void testSumar4() {
        service.sumar(8, -4, model);
        Assertions.assertEquals(4.0, model.getAttribute("resultado"));
    }

    @Test
    public void testSumar5() {
        service.sumar(-8, -4, model);
        Assertions.assertEquals(-12.0, model.getAttribute("resultado"));
    }

    @Test
    public void testSumar6() {
        service.sumar(1000000, 4000000, model);
        Assertions.assertEquals(5000000.0, model.getAttribute("resultado"));
    }

}
