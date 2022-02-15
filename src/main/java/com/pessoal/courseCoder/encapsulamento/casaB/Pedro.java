package com.pessoal.courseCoder.encapsulamento.casaB;

import com.pessoal.courseCoder.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

    void testeAcessos() {

        //System.out.println(mae.segredo); visibilidade privada
        //System.out.println(mae.facoDentroDeCasa); visibilidade pacote
        System.out.println(formaDeFalar); // acesso via heranca sem acessar criando extancia "new"
        System.out.println(todosSabem);
        //ou
        System.out.println(new Ana().todosSabem);
    }
}
