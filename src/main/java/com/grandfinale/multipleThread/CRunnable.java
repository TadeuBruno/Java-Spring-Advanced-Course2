package com.grandfinale.multipleThread;

public class CRunnable implements Runnable { //dessa maneira vc pode usar um extend se precisar
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
