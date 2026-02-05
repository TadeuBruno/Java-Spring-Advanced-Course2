package com.grandfinale;

import com.grandfinale.ApiCollection.ApiCollection;
import com.grandfinale.exception.MyException;
import com.grandfinale.interfaceExample.*;
import com.grandfinale.interfaceExample.FunctionalInterface;
import com.grandfinale.mocks.A;
import com.grandfinale.mocks.AbstractA;
import com.grandfinale.quiz.QuestionService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        ApiCollection apiCol = new ApiCollection();

        int ii = 20;
        int jj = 0;

        QuestionService questionService = new QuestionService();
//        questionService.playQuiz();
//        questionService.showScore();

        InnerClass innerClass = new InnerClass();
        innerClass.show();

        InnerClass.B b = innerClass.new B(); // Para se instanciar inner class não estática
        b.classB();

        InnerClass.C c = new InnerClass.C(); // Para instanciar inner class estáticas.

        A a = new A()
        { // Anonymous inner class
            public void show(){
            System.out.println("in new show");
            }
        };
        a.show();

        AbstractA absA = new AbstractA() { // Instanciando classe Abstrata com classe anonima
            public void show() {
                super.show();
                System.out.println("Classe anonima");
            }
        };
        absA.show();

        Computer laptop = new Laptop();
        Computer desktop = new Desktop();

        Developer navin = new Developer();
        navin.devApp(desktop);

        Status s = Status.Pending;
        System.out.println(s);
        System.out.println(s.ordinal());// Printa como se fosse a posição dele no array do enum

        Status[] all = Status.values();
        System.out.println(Arrays.toString(all));

        LaptopEnum[] laptopEnum = LaptopEnum.values();
        System.out.println(Arrays.toString(laptopEnum));

        for(LaptopEnum lap :  laptopEnum){
            System.out.println(lap + ": " + lap.getPrice());
        }


        //Lambda - Não cria um arquivo novo na compilacão como a classe anonima faz
        FunctionalInterface funcInterface = (int i) -> System.out.println("In show");
        funcInterface.show(5);

        //lambda com return - quando é apenas 1 statment nao precisa do return
        FunctionalInterface2 funcInterface2 = (i, j) -> i+j;
        System.out.println(funcInterface2.add(5, 4));

        //try-catch

        try{
            jj = 18/ii;

            if(jj == 0){
                throw new MyException("Error");
            }

            if(jj == 0.5){
                throw new MyException("Error");
            }


        }catch (ArithmeticException e){
            jj = 18/1;
            System.out.println(e);
        }catch (MyException e){
            System.out.println(e);
        }catch (Exception e){
            System.out.println(e);
        }

        System.out.println(jj);

        try{
            Class.forName("Calc");
            //Se nao tratar com try catch ia ter que colocar o throws do lado no nome da função, dessa maneira quem usar essa funcao ia ter que tratar a exceção
        }catch (ClassNotFoundException e){
            System.out.println("Class not found");
        }finally { //o finally é usado para fechar recursos - conexao com db, recursos...
            System.out.println("end");
        }


//        AThread athread = new AThread();
//        BThread bThread = new BThread();
//
//        athread.start();
//        try {
//            Thread.sleep(10);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        bThread.start();

//        System.out.println("Runnable");
//        Runnable obj1 = () -> {
//                for (int i = 0; i < 10; i++) {
//                    System.out.println("hi");
//                    try {
//                        Thread.sleep(10);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//        };
//        Thread t1 = new Thread(obj1);
//
//        t1.join(); //O main espera o t1 finalizar para fazer as proximas coisas
//
//        t1.start();

        apiCol.run();
        apiCol.list();
    }
}