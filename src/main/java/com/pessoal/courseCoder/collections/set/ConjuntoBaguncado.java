package com.pessoal.courseCoder.collections.set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add(false);
        conjunto.add("teste");
        conjunto.add("teste");
        conjunto.add("x");
        conjunto.add(1);

        System.out.println("Tamanho é " + conjunto.size());

        System.out.println(conjunto.remove("teste"));

        System.out.println(conjunto.contains("x"));
        System.out.println(conjunto.contains("teste"));

        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        //conjunto.addAll(nums); // uniao entre dois conjuntos
        conjunto.retainAll(nums); // interscção - retem somente o valor em comum
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);
    }
}
