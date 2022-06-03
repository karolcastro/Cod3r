package com.pessoal.courseCoder.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Bolacha", 2.50, true);
        Produto produto2 = new Produto("Panela", 52.50, false);
        Produto produto3 = new Produto("Vassoura", 12.50, false);
        Produto produto4 = new Produto("Arroz", 22.50, true);
        Produto produto5 = new Produto("Feijao", 8.50, true);

        Consumer<String> print = System.out::println;
        List< Produto> produtoList = Arrays.asList(produto1,produto2,produto3,produto4,produto5);

        Predicate<Produto> isCpg = p -> p.cpg;
        Predicate<Produto> preco = p -> p.preco >= 20.00;
        Function<Produto, String > oferta = p -> "Oferta da semana --> " + p.nome + " R$ " + p.preco + " !!";

        produtoList.stream()
                .filter(isCpg)
                .filter(preco)
                .map(oferta)
                .forEach(print);

    }
}
