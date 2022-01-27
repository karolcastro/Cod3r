package com.pessoal.courseCoder.collections.set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoComportado {

    public static void main(String[] args) {
        Set<String> listaAprovados = new HashSet<>();

        listaAprovados.add("Ana");
        listaAprovados.add("Paula");
        listaAprovados.add("Jose");
        listaAprovados.add("Zeca");
        listaAprovados.add("Fabio");

        for(String candidatos: listaAprovados) {
            System.out.println(candidatos);
        }
    }
}
