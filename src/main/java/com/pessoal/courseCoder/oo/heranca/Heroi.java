package com.pessoal.courseCoder.oo.heranca;

public class Heroi extends Jogador {


    boolean atacar(Jogador oponente){
        int deltaX = Math.abs(x - oponente.x);
        int destaY = Math.abs(y - oponente.y);

        if(deltaX == 0 && destaY == 1) {
            oponente.vida -= 20;
            return true;
        } else if(deltaX == 1 && destaY == 0) {
            oponente.vida -= 20;
            return true;
        } else {
            return false;
        }
    }

}
