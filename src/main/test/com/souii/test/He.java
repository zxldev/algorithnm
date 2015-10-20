package com.souii.test;

import com.souii.Hello;
import com.souii.list.LinkList;
import com.souii.list.LinkListUtil;
import com.souii.runable.AsyncRunnable;
import com.souii.runable.HelloRunnable;
import com.souii.runable.SleepRunnable;
import com.souii.thread.HelloThread;
import junit.framework.TestCase;
import org.junit.Test;


/**
 * Created by zx on 2015/10/16.
 */
public class He extends TestCase {
    @Test
    public void testList(){
        LinkListUtil link = new LinkListUtil();
        LinkList delete = null;
        for(int i=0;i<10;i++){
            LinkList temp = new LinkList(i);
            if(i==9){
                delete = temp;
            }
            link.insert(temp);
        }
        link.print();
        link.delete(delete);
        link.print();
    }

    @Test
    public void testThread(){
        HelloThread h1=new HelloThread("A");
        HelloThread h2=new HelloThread("B");
        h1.start();
        h2.start();
    }

    @Test
    public void testRunnable(){
        HelloRunnable h1=new HelloRunnable("线程A");
        Thread demo= new Thread(h1);
        HelloRunnable h2=new HelloRunnable("线程Ｂ");
        Thread demo1=new Thread(h2);
        //设置线程运行优先级
        demo.setPriority(9);
        demo1.setPriority(10);
        //判断线程是否启动
        System.out.print(demo.isAlive());
        demo.start();

        System.out.print(demo.isAlive());
        demo1.start();
    }

    @Test
    public void testSleepThread(){
        SleepRunnable he = new SleepRunnable();
        Thread demo = new Thread(he, "线程");
        SleepRunnable he2 = new SleepRunnable();
        Thread demo2 = new Thread(he2, "线程");
        demo.start();
        demo2.start();
    }

    @Test
    public void testAsyncRunnable(){
        AsyncRunnable he=new AsyncRunnable();
        Thread h1=new Thread(he);
        Thread h2=new Thread(he);
        Thread h3=new Thread(he);
        Thread h4=new Thread(he);

        h1.start();
        h2.start();
        h3.start();
        h4.start();
    }
}
