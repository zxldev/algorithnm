package com.souii.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.souii.Hello;
import com.souii.list.LinkList;
import com.souii.list.LinkListUtil;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Stack;


/**
 * Created by zx on 2015/10/16.
 */
public class THello extends TestCase {
    @Test
    public void testHello(){
        Hello hello = new Hello();
        hello.printHello();
    }

    @Test
    public void testTest() {
        String jsonString = "{\"servername\":\"\\u5185\\u8d44\\u516c\\u53f8\\u6ce8\\u518c\",\"orderphone\":\"12333333333\"}";
        Map<String, Object> listMap = JSON.parseObject(jsonString,new TypeReference<Map<String, Object>>(){});
        System.out.println(listMap.toString());
    }





}
