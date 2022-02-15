package com.pessoal.courseCoder.oo.polimorfismo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Sorvete {

    private double peso;

    public Sorvete(double peso) {
        setPeso(peso);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso >= 0) {
            this.peso = peso;
        }
    }

}
