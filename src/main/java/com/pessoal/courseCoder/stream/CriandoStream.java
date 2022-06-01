package com.pessoal.courseCoder.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStream {
    public static void main(String[] args) {

        //interface funcional que recebe um parametro e nao retorna nada  Consumer<String>
        Consumer<String> print = System.out::print;
        Consumer<Integer> println = System.out::println;

        // 1 forma de criar uma Stream
        Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
        langs.forEach(print);

        // 2 forma de criar uma Stream
        String[] maisLangs = {"Python ", "Lisp ", "Perl ", "GO\n"};

        Stream.of(maisLangs).forEach(print);

        // 3 forma de criar uma Stream
        Arrays.stream(maisLangs).forEach(print);

        // 4 forma de criar uma Stream
        Arrays.stream(maisLangs, 1, 2).forEach(print);

        // 5 forma de criar uma Stream
        List< String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin \n");
        outrasLangs.parallelStream().forEach(print);

        // 6 forma de criar uma Stream infinita
        //Stream.generate(() -> "a").forEach(print);

        // 7 forma de criar uma Stream infinita com ordenacao
        //Stream.iterate(0, n -> n + 1).forEach(println);
    }
}
