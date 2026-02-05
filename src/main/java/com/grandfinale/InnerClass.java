package com.grandfinale;

public class InnerClass {

    int age;

    public void show(){
        System.out.println("in show");
    }

    class B{
        public void classB(){
            System.out.println("in class B");
        }
    }

    static class C{ // inner classes can be static
        public void classC(){
            System.out.println("in class C");
        }
    }
}
