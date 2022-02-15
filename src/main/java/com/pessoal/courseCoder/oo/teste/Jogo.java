package com.pessoal.courseCoder.oo.teste;

import com.pessoal.courseCoder.oo.heranca.Direcao;
import com.pessoal.courseCoder.oo.heranca.Heroi;
import com.pessoal.courseCoder.oo.heranca.Monstro;

public class Jogo {
    public static void main(String[] args) {

        Monstro monstro = new Monstro(10,12);
        //monstro.x = 10;
        //monstro.y = 10;

        Heroi heroi = new Heroi(10, 11);
        //heroi.x = 10;
        //heroi.y = 11;

        System.out.println("Monstro tem => " + monstro.vida);
        System.out.println("Heroi tem => " + heroi.vida);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        System.out.println();
        monstro.andar(Direcao.NORTE);
        monstro.atacar(heroi);
        heroi.atacar(monstro);
        System.out.println("Monstro tem => " + monstro.vida);
        System.out.println("Heroi tem => " + heroi.vida);
    }
}
