package com.javabasic.com.javabasic.final_s;

public class FinalTest {
    public static void main(String[] args) {
        new FinalTest().test(3);
    }

    //局部 final 变量 a ， b
    public void test (final int b) {

        final int a  = 10;

        //匿名内部类
        new Thread() {
            public void run() {
                System.out.println(a);
                System.out.println(b);
            }
        }.start();
    }
}

class outClass {
    private int age = 12;

    public void outPrint(final int x) {
        class InClass {
            public void InPrint() {
                System.out.println(x);
                System.out.println(age);
            }
        }

        new InClass().InPrint();
    }
}
