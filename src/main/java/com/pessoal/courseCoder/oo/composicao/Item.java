package com.pessoal.courseCoder.oo.composicao;

import com.pessoal.courseCoder.oo.composicao.desafio.Produto;

public class Item {

    public double quantidade;
    public Produto produto;
    String nome;
    double preco;

    public Item(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public Item(Produto p, int quantidade) {
    }
}
