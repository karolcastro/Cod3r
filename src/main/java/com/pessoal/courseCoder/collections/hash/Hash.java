package com.pessoal.courseCoder.collections.hash;

import com.pessoal.courseCoder.collections.list.Usuario;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        HashSet<Usuario> usuario = new HashSet<Usuario>();

        usuario.add(new Usuario("Pedro"));
        usuario.add(new Usuario("Ana"));
        usuario.add(new Usuario("Maria"));

        boolean result = usuario.contains(new Usuario("Maria"));
        System.out.println(result);
    }
}
