package com.souii.test.therad;

import com.souii.thread.HelloThread;
import junit.framework.TestCase;
import org.junit.Test;


/**
 * Created by zx on 2015/10/16.
 */
public class TThread extends TestCase {
    @Test
    public void testThread(){
        HelloThread h1=new HelloThread("A");
        HelloThread h2=new HelloThread("B");
        h1.start();
        h2.start();
    }
}
