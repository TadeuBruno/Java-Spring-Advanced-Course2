package com.grandfinale;

public abstract class Abstract {

    public abstract void drive();

    public void sing(){
        System.out.println("singing");
    }
}
// Não pode ser instanciada
// Se tiver filho ele deve obrigatoriamente implementar o drive