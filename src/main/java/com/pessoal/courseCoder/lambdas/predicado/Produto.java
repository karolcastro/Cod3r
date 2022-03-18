package com.pessoal.courseCoder.lambdas.predicado;

public class Produto {

    public String nome;
    public double preco;
    public double desconto;


    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    @Override
    public String toString() {
        double precoFinal = preco * (1 - desconto);
        return "Produto " + nome +
                " tem o preco de R$ " + precoFinal
                ;
    }
}
