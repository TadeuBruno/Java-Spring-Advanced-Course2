package com.grandfinale.multipleThread;

public class Counter {

    int count;

    public synchronized void increment(){ // o synchronized faz com que apenas 1 thread manipule por vez
        count++;
    }
}
