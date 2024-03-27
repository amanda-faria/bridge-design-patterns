package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MilkshakeTest {

    @Test
    void deveRetornarValorMilkshakeSaborChocolate() {
        Sabores sabores = new Chocolate();
        Milkshake milkshake = new Milkshake(10.0f);
        milkshake.setSabores(sabores);
        milkshake.setCobertura(2);
        assertEquals(20.0f, milkshake.calcularValor(), 0.01f);
    }

    @Test
    void deveRetornarValorMilkshakeSaborCreme() {
        Sabores sabores = new Creme();
        Milkshake milkshake = new Milkshake(10.0f);
        milkshake.setSabores(sabores);
        milkshake.setCobertura(2);
        assertEquals(22.0f, milkshake.calcularValor(), 0.01f);
    }

    @Test
    void deveRetornarValorMilkshakeSaborFlocos() {
        Sabores sabores = new Flocos();
        Milkshake milkshake = new Milkshake(10.0f);
        milkshake.setSabores(sabores);
        milkshake.setCobertura(2);
        assertEquals(24.0f, milkshake.calcularValor(), 0.01f);
    }

    @Test
    void deveRetornarValorMilkshakeSaborMorango() {
        Sabores sabores = new Morango();
        Milkshake milkshake = new Milkshake(10.0f);
        milkshake.setSabores(sabores);
        milkshake.setCobertura(2);
        assertEquals(26.0f, milkshake.calcularValor(), 0.01f);
    }
}