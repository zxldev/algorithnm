package com.souii.runable;

/**
 * Created by zx on 2015/10/20.
 */
public class SleepRunnable implements Runnable {
    private String name;

    public SleepRunnable() {

    }

    public SleepRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("线程完成休眠1");
                Thread.sleep(1000);
                System.out.println("线程完成休眠");
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("休眠被打断");
            }
            System.out.println(name + "运行     " + i);
        }
    }
}
