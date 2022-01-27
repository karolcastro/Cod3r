package com.pessoal.courseCoder.collections.map;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

    public static void main(String[] args) {
        Map<Integer, String> usuario = new HashMap<>();
        usuario.put(1, "Roberto");
        usuario.put(2, "Ricardo");
        usuario.put(3, "Rafaela");
        usuario.put(4, "Rebeca");

        System.out.println(usuario.size());
        System.out.println(usuario.isEmpty());

        System.out.println(usuario.keySet());
        System.out.println(usuario.values());
        System.out.println(usuario.entrySet());

        System.out.println(usuario.containsKey(4));
        System.out.println(usuario.containsValue("Rebeca"));

        System.out.println(usuario.get(3));
        System.out.println(usuario.remove(1));
        System.out.println(usuario.remove(1, "Gui"));


        for(int chave : usuario.keySet()) {
            System.out.println(chave);
        }

        for(String valor : usuario.values()) {
            System.out.println(valor);
        }

        for(Map.Entry<Integer, String> registro : usuario.entrySet()) {
            System.out.print(registro.getKey() + " =====> ");
            System.out.println(registro.getValue());
        }
    }
}
