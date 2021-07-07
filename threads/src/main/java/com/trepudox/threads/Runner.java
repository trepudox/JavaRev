package com.trepudox.threads;

import com.trepudox.threads.threads.Thread1;
import com.trepudox.threads.threads.Thread2;

public class Runner {

    public static void main(String[] args) {

        thread1Fun();
        thread2Fun();

    }

    private static void thread1Fun() {
        Thread t = new Thread1();

        t.start();
        System.out.println(t.isAlive());

    }

    private static void thread2Fun() {
        Thread t = new Thread(new Thread2("thread2"));

        t.start();
    }

}
