package com.souii.test;

import com.souii.Hello;
import com.souii.list.LinkList;
import com.souii.list.LinkListUtil;
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
}
