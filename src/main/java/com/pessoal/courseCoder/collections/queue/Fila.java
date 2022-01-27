package com.pessoal.courseCoder.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args){
        Queue<String> fila = new LinkedList<String>();

        fila.add("Ana");
        fila.offer("Manu");
        fila.offer("Carlos");
        fila.offer("Maria");
        fila.offer("Gui");

        System.out.println(fila.peek());// retorna false
        System.out.println(fila.element()); // lanca exceção caso a fila esteja vazia

        //fila.size();
        //fila.clear();
        //fila.isEmpty();

        System.out.println(fila.poll());

    }
}
