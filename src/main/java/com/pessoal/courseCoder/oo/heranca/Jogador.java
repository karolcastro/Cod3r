package com.pessoal.courseCoder.oo.heranca;

public class Jogador {

    int vida = 100;
    int x;
    int y;

    boolean atacar(Jogador oponente){
        int deltaX = Math.abs(x - oponente.x);
        int destaY = Math.abs(y - oponente.y);

        if(deltaX == 0 && destaY ==1) {
            oponente.vida -= 10;
            return true;
        } else if(deltaX == 1 && destaY ==0) {
            oponente.vida -= 10;
            return true;
        } else {
            return false;
        }
    }

    boolean andar(Direcao direcao) {
        switch(direcao) {
            case NORTE:
                y--;
                break;
            case SUL:
                y++;
                break;
            case LESTE:
                x++;
                break;
            case OESTE:
                x--;
                break;
        }

        return true;
    }
}
