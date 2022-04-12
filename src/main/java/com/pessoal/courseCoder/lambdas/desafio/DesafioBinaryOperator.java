package com.pessoal.courseCoder.lambdas.desafio;

import com.pessoal.courseCoder.lambdas.predicado.Produto;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioBinaryOperator {
    public static void main(String[] args) {

        Produto produto1 = new Produto("caneta", 2.50,0.50);

        //A partir do produto calcular o peco real (com desconto)
        Function<Produto, Double> precoFinal = produto -> produto.preco * (1 - produto.desconto);

        //Imposto Municipal: >=2500 (8,5%)/ <2500 (Isento)
        UnaryOperator <Double> impostoMunicipal = valor -> valor >= 2500 ? valor *1.085 : valor;

        //Frete: >= 3000 (100)/ < 3000(50)
        UnaryOperator<Double> frete = valor -> valor >= 3000 ? valor + 100 : valor + 50;

        //Arredondar: Deixar duas casas decimais
        //UnaryOperator<Double> arredondar = valor -> Double.valueOf(String.format("%.2f", valor));

        //Formatar: R$1234,56
        Function<Double, String> formatar = valor -> ("R$" + valor).replace(".", ",");



        String preco = precoFinal
                .andThen(impostoMunicipal)
                .andThen(frete)
                //.andThen(arredondar)
                .andThen(formatar)
                .apply(produto1);

        System.out.println("O preço final é de: " + preco);

    }
}
