package com.pessoal.courseCoder.oo.composicao.desafio;

public class ClienteTeste {

    public static void main(String[] args) {

        Compra compra1 = new Compra();
        compra1.adicionarItem("Caneta", 1.96, 2);
        compra1.adicionarItem(new Produto("Impressora", 1.956),1);

        Compra compra2 = new Compra();
        compra2.adicionarItem("Lapis",1.25, 3);
        compra2.adicionarItem(new Produto("Borracha", 0.60), 5);

        Cliente cliente = new Cliente("MAria");


        System.out.println(cliente.obterValorTotal());


    }
}
