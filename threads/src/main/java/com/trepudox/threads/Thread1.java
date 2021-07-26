package com.trepudox.threads;

public class Thread1 extends Thread {

    public void run() {
        System.out.println(this);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
    }

}
