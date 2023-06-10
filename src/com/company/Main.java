package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        SingleLinkedList list=new SingleLinkedList();
        list.push(5);
        list.push(10);
        list.push(15);
        list.push(20);


        list.remove(4);
        list.traverce();


    }
}
