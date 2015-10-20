package com.souii.runable;

/**
 * Created by zx on 2015/10/20.
 */
public class AsyncRunnable implements Runnable {
    public AsyncRunnable() {

    }



    @Override
    public void run() {
        for(int i=0;i<10;++i){
            if(count>0){
//                try{
//                    Thread.sleep(1000);
//                }catch(InterruptedException e){
//                    e.printStackTrace();
//                }
                System.out.println(count--);
            }
        }
    }



    private int count = 10;
}
