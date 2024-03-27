package org.example;

public class Sundae extends Sorvete {

    public Sundae(float valor) {
        super(valor);
    }

    public float calcularValor() {
        return this.valor * (1 + this.sabores.percentualSabores());
    }
}