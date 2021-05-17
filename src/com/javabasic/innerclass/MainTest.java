package com.javabasic.innerclass;

public class MainTest {
    public static void main(String[] args) {
        //实现类
        MyInterface myImplement = new MyImplement();
        myImplement.print();

        //匿名内部类
        MyInterface myInterface = new MyInterface() {
            @Override
            public void print() {
                System.out.println("interface");
            }
        };

        myInterface.print();
    }
}
