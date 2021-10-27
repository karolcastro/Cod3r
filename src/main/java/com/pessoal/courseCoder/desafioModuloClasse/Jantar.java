package com.pessoal.courseCoder.desafioModuloClasse;

public class Jantar {

    public static void main(String[] args) {

        Comida comida1 = new Comida("arroz",0.2);
        Pessoa pessoa1 = new Pessoa("Lucas", 78.0);

        System.out.println(pessoa1.nome + ", " + pessoa1.peso);
        pessoa1.comer(comida1);
        System.out.println();
        System.out.println("Comeu");
        System.out.println(pessoa1.nome + ", " + pessoa1.peso);



}
    }