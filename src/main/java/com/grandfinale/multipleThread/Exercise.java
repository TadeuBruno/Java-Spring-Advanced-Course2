package com.grandfinale.multipleThread;
class PrinterTask implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": Running task " + i);
        }
    }
}

public class Exercise {
    public static void main(String[] args) throws InterruptedException{
        // TODO: Create a single PrinterTask object
        Runnable printer = new PrinterTask();

        Thread t1 = new Thread(printer, "Worker-1");
        Thread t2 = new Thread(printer, "Worker-2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}
