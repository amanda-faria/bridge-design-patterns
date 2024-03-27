package org.example;

public class Milkshake extends Sorvete{

    private int cobertura;
    public Milkshake(float valor) {
        super(valor);
    }

    public void setCobertura(int cobertura) {
        this.cobertura = cobertura;
    }
    public float calcularValor() {
        return this.valor * this.cobertura * (1+ this.sabores.percentualSabores());
    }
}
