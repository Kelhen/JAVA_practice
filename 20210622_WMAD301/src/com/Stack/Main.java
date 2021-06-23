package com.Stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> demo = new Stack<>();
        demo.push(0);
        demo.push(1);
        demo.push(2);
        demo.push(3);
        demo.push(4);

        for (int temp:demo
             ) {
            System.out.println(temp);
        }

        demo.pop();
        System.out.println("****************");

        for (int temp:demo
             ) {
            System.out.println(temp);
        }
        System.out.println(demo.peek()); //checks the last element in thee stack
    }


}
