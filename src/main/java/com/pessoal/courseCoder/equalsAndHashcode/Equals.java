package com.pessoal.courseCoder.equalsAndHashcode;

import java.util.Date;

public class Equals {
    public static void main(String[] args){
        Usuario u1 = new Usuario();
        u1.name = "Pedro Silva";
        u1.email = "pedroSilva@email.com";

        Usuario u2 = new Usuario();
        u2.name = "Pedro Silva";
        u2.email = "pedroSilva@email.com";

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));

        System.out.println(u2.equals(new Date()));
    }
}
