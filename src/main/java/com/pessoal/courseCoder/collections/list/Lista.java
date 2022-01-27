package com.pessoal.courseCoder.collections.list;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<>();

        Usuario a = new Usuario("Ana");
        lista.add(a);
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Bia"));

        System.out.println(lista.get(2)); // acessar pelo indice

        lista.remove(1);
        System.out.println("tem ?  = "+ lista.contains(new Usuario("Bia")));

        for (Usuario u : lista) {
            System.out.println(u.nome);
            System.out.println(u);
        }
    }
}
