package com.grandfinale.StreamApi;

import java.util.Arrays;
import java.util.List;

public class streamApi {

    public void stream(){
        List<Integer> nums = Arrays.asList(1,2,5,4,2);

        nums.forEach(n -> System.out.println(n));
    }

    public void stream2(){
        List<Integer> nums = Arrays.asList(1,2,5,4,2);

        Stream<Integer> s1 = nums.stream(); //Dessa maneira vc nao manipula o nums inicial - pode trabalhar com threads

        Stream<Integer> s2 = s1.filter(n -> n%2 ==0); //filtra apenas os numeros pares

        Stream<Integer> s3 = s2.map(n -> n*2); //multiplica todos por 2

        int result = s3.reduce(0, (c,e) -> c+e); //soma todos os elementos, e retorna 1 inteiro

        int result2 = nums.stream() //Tudo junto
                .filter(n -> n%2 ==0)
                .map(n -> n*2)
                .reduce(0, (c,e) -> c+e);

        int resultSorted = nums.stream() //Tudo junto
                .filter(n -> n%2 ==0)
                .sorted();


        System.out.println(result2);

        // s1.forEach(n -> System.out.println(n)); vc só pode usar o stream uma vez, nao poderia ter 2 linhas dessas
    }

    public void sum(){
        List<Integer> nums = Arrays.asList(1,2,5,4,2);

        nums.stream()
                .map(i -> i*2)
                .mapToInt(i -> i) //converte para IntStream
                .sum(); //soma todos os elementos
    }

    public void parallelStream(){
        List<Integer> nums = Arrays.asList(1,2,5,4,2);

        nums.parallelStream() //muito mais rapido
                .map(i -> i*2)
                .mapToInt(i -> i) //converte para IntStream
                .sum(); //soma todos os elementos
    }

    public void optional(){
        List<String> names = Arrays.asList("John", "Jane", "Jack", "Jill");

        Optinal<String> name = names.stream()
                .filter(i -> i.contains("x"))
                .findFirst() 
                .orElse("Not found"); //se nao encontrar o elemento retorna "Not found"

        System.out.println(name);
    }

    public void methodReference(){
        List<String> names = Arrays.asList("John", "Jane", "Jack", "Jill");

        names.stream()
                .map(String::toUpperCase) //mesma coisa que .map(i -> i.toUpperCase())
                .forEach(System.out::println); //mesma coisa que .forEach(i -> System.out.println(i))
    }}
}
