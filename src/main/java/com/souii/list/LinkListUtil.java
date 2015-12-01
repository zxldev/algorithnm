package com.souii.list;

/**
 * Created by zx on 2015/10/16.
 */
public class LinkListUtil {
    LinkList header;
    int length;
    public LinkListUtil() {
        length = 0;
    }

    /**
     * 向列表中插入元素
     * @param list
     * @return
     */
    public int insert(LinkList list){
        //头插法插入节点
        if(header!=null){
            list.next =  header;
        }
        header = list;
        length++;
        return 0;
    }

    /**
     * 删除列表中的指定元素
     * @param list
     * @return
     */
    public int delete(LinkList list){
        //如果删除为空，直接返回错误
        if(list != null){
            //如果不是最后一个节点，则执行交换删除
            if(list.next!=null){
                list.value = list.next.value;
                list.next = list.next.next;
            }else {
                //如果是最后一个节点，这循环找出删除节点的父节点，其next置空
                LinkList p = header;
                while (p.next!=list){
                    p=p.next;
                }
                p.next = null;
            }
            return 0;
        }else {
            return -1;
        }

    }

    /**
     * 打印列表
     */
    public void print(){
        LinkList p= header;
        //循环数据节点
        while (p!=null){
            System.out.println(p.value);
            p = p.next;
        }
    }



}
