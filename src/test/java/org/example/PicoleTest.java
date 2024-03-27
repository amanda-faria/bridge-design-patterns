package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PicoleTest {

    @Test
    void deveRetornarValorPicoleSaborChocolate() {
        Sabores sabores = new Chocolate();
        Picole picole = new Picole(3.0f);
        picole.setSabores(sabores);
        assertEquals(3.0f, picole.calcularValor(), 0.01f);
    }

    @Test
    void deveRetornarValorPicoleSaborCreme() {
        Sabores sabores = new Creme();
        Picole picole = new Picole(3.0f);
        picole.setSabores(sabores);
        assertEquals(3.0f, picole.calcularValor(), 0.01f);
    }

    @Test
    void deveRetornarValorPicoleSaborFlocos() {
        Sabores sabores = new Flocos();
        Picole picole = new Picole(3.0f);
        picole.setSabores(sabores);
        assertEquals(3.0f, picole.calcularValor(), 0.01f);
    }

    @Test
    void deveRetornarValorPicoleSaborMorango() {
        Sabores sabores = new Morango();
        Picole picole = new Picole(3.0f);
        picole.setSabores(sabores);
        assertEquals(3.0f, picole.calcularValor(), 0.01f);
    }


}