package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SundaeTest {

    @Test
    void deveRetornarValorSundaeSaborChocolate() {
        Sabores sabores = new Chocolate();
        Sundae sundae = new Sundae(10.0f);
        sundae.setSabores(sabores);
        assertEquals(10.0f, sundae.calcularValor(), 0.01f);
    }

    @Test
    void deveRetornarValorSundaeSaborCreme() {
        Sabores sabores = new Creme();
        Sundae sundae = new Sundae(10.0f);
        sundae.setSabores(sabores);
        assertEquals(11f, sundae.calcularValor(), 0.01f);
    }

    @Test
    void deveRetornarValorSundaeSaborFlocos() {
        Sabores sabores = new Flocos();
        Sundae sundae = new Sundae(10.0f);
        sundae.setSabores(sabores);
        assertEquals(12.0f, sundae.calcularValor(), 0.01f);
    }

    @Test
    void deveRetornarValorSundaeSaborMorango() {
        Sabores sabores = new Morango();
        Sundae sundae = new Sundae(10.0f);
        sundae.setSabores(sabores);
        assertEquals(13.0f, sundae.calcularValor(), 0.01f);
    }


}