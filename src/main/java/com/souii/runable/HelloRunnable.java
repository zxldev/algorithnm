package com.souii.runable;

/**
 * Created by zx on 2015/10/20.
 */
public class HelloRunnable implements Runnable {
    public HelloRunnable() {

    }

    public HelloRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + "运行     " + i);
        }
    }



    private String name;
}
