package com.javabasic.final_s;

public class FinalVar {
    final static int a = 0;     //在声明的时候就需要赋值，或者静态代码块父子
    /*
    static {
        a = 0
    }
     */

    final int b = 0;        //在声明的时候就需要赋值 或者代码块中赋值，构造器中赋值

    /*
    {
        b = 0;
    }
     */

    public static void main() {
        final int localA;       //局部变量只声明没有初始化，不会报错，与 final 无关
        localA = 0;             //使用之前一定需要赋值

        //localA = 1;           //不被允许第二次赋值
    }
}
