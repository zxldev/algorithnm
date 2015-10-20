package com.souii.thread;

/**
 * Created by zx on 2015/10/19.
 */
public class HelloThread extends Thread{
    public HelloThread() {

    }

    public HelloThread(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + "运行     " + i);
        }
    }

    private String name;
}
