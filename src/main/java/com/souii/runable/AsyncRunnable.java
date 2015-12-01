package com.souii.runable;

/**
 * Created by zx on 2015/10/20.
 */
public class AsyncRunnable implements Runnable {
    private int count = 10;

    public AsyncRunnable() {

    }

    @Override
    public void run() {
        for(int i=0;i<10;++i){
         sale();
        }
    }

    //加入线程同步方法
    public synchronized void sale(){
        if (count > 0) {
            System.out.println(count--);
        }
    }

    public static void main(String[] args){
        AsyncRunnable he=new AsyncRunnable();
        Thread h1=new Thread(he);
        Thread h2=new Thread(he);
        Thread h3=new Thread(he);

        h1.start();
        h2.start();
        h3.start();
    }
}
