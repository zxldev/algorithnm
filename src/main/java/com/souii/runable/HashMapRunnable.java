package com.souii.runable;

import java.util.HashMap;

/**
 * Created by zxldev on 2015/12/4.
 */
public class HashMapRunnable implements Runnable{
    public String name;
    public HashMap<String,String> hashMap;
    public volatile int  i = 0;
    public HashMapRunnable(String name){
        this.name = name;
        hashMap = new HashMap<String, String>();
    }
    @Override
    public void run() {
        fun();
    }

    public  void fun(){
        for (int i =0;i<100;i++){
            this.increasei();
            this.hashMap.put(String.valueOf(i)+this.name,"1");
//            System.out.println(String.valueOf(i)+"|"+this.name+"@"+i);
        }
        System.out.println(this.i);
    }

    public synchronized void increasei(){
        this.i++;
    }
}
