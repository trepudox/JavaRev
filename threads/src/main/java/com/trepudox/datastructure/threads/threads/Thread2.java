package com.trepudox.datastructure.threads.threads;

public class Thread2 implements Runnable {

    private String name;

    public Thread2(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("RODEI");
        System.out.println(Thread.currentThread().getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
