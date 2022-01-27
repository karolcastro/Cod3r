package com.pessoal.courseCoder.oo.composicao;

public class CompraTest {

    public static void main(String[] args){
        Compra c1 = new Compra();

        c1.cliente = "Joao";
        c1.itens.add(new Item("caneta", 20, 5.45));
        c1.itens.add(new Item("lapis",15,1.15));


        System.out.println(c1.itens.size());
        System.out.println(c1.get());
    }

}
