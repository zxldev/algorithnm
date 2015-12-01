package com.souii.test;

import com.souii.Hello;
import junit.framework.TestCase;
import org.junit.Test;


/**
 * Created by zx on 2015/10/16.
 */
public class THello extends TestCase {
    @Test
    public void testHello(){
        Hello hello = new Hello();
        hello.printHello();
    }
}
