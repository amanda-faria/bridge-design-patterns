package org.example;

public abstract class Sorvete {

    protected Sabores sabores;

    protected float valor;

    public Sorvete(float valor) {
        this.valor = valor;
    }

    public void setSabores(Sabores sabores) {
        this.sabores = sabores;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public abstract float calcularValor();
}