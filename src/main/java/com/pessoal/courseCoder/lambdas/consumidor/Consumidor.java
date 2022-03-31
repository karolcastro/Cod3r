package com.pessoal.courseCoder.lambdas.consumidor;

import com.pessoal.courseCoder.lambdas.predicado.*;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {

        Consumer<Produto> imprimir =
                p -> System.out.println(p.nome + "!!");

        Produto prod1 = new Produto("caneta", 6.30, 0.15);
        imprimir.accept(prod1);

        Produto prod2 = new Produto("borracha", 6.30, 0.19);
        Produto prod3 = new Produto("Note", 6090.30, 0.25);
        Produto prod4 = new Produto("caderno", 16.30, 0.1);
        Produto prod5 = new Produto("caneta", 2.30, 0.05);

        List<Produto> lista1 = Arrays.asList(prod1, prod2, prod3, prod4, prod5);
        lista1.forEach(imprimir);
        lista1.forEach(p -> System.out.println(p.preco));// lambda
        lista1.forEach(System.out::println);// method reference
    }
}
