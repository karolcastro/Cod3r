package com.pessoal.courseCoder.desafioModuloClasse;

import lombok.Getter;

@Getter
public class Comida {

    String comida;
    Double peso;

    public Comida(String comida, Double peso) {
        this.comida = comida;
        this.peso = peso;
    }
}
