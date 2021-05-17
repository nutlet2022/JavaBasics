package com.javabasic.test;

public class Test {
    public static void main(String[] args) {
        ok:
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(i + j);
                if (j == 4)
                    break ok;
            }
        }
    }
}
