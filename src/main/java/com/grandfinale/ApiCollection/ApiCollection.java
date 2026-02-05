package com.grandfinale.ApiCollection;


import java.util.*;

public class ApiCollection {

    public void run(){

        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(6);
        nums.add(5);
        nums.add(6);
        nums.add(2);

        for(Integer n : nums){
            System.out.println(n);
        }
    }

    public void list(){

        List<Integer> nums = new ArrayList<Integer>(); //List permite trabalhar com indice
        nums.add(6);
        nums.add(5);
        nums.add(6);
        nums.add(2);

        System.out.println(nums.get(1));
        System.out.println(nums.indexOf(6));
    }

    public void set(){

        Set<Integer> nums = new HashSet<Integer>(); //Nao permite dados duplicados e nao se importa com a ordem
        nums.add(6);
        nums.add(5);
        nums.add(6);
        nums.add(2);

        for(Integer n : nums){
            System.out.println(n);
        }


        Set<Integer> nums1 = new TreeSet<>(); //Se importa com a ordem
        nums.add(6);
        nums.add(5);
        nums.add(6);
        nums.add(2);
    }

    public void map(){
        //key-value

        Map<String, Integer> students = new HashMap<>();
        //hashtable é syncronized(melhor para trabalhar com threads) e o HashMap não

        students.put("t1", 1); //as keys são únicas, ele nao aceita 2 keys iguais, e se tiver pega a última
        students.put("t2", 2);

        System.out.println(students);
        System.out.println(students.get("t1"));
        System.out.println(students.keySet()); //give all the keys
        System.out.println(students.values()); //give all the values

        for(String key : students.keySet()){
            System.out.println(students.get(key));

        }

    }

    public void sorting(){

        Comparator<Integer> com = (i, j) -> i%10 > j%10 ? 1 : 0;

        List<Integer> nums = new ArrayList<>();
        nums.add(41);
        nums.add(13);
        nums.add(62);
        nums.add(54);

        Collections.sort(nums, com); //consegue fazer o sort com a sua própria lógica
        System.out.println(nums);

    }

}
