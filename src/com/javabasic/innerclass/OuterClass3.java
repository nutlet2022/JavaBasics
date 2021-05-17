package com.javabasic.innerclass;

public class OuterClass3 {

    private String outerName;

    public void print() {

        System.out.println("Outer Class");
        System.out.println(outerName);

        //不能使用 public 进行修饰
        class InnerClass {
            private String innerName;

            public InnerClass() {
                innerName = "inner name";
            }

            public void print() {
                System.out.println("Inner Class");
                System.out.println(innerName);
            }

        }

        InnerClass innerClass = new InnerClass();
        innerClass.print();
    }

    public static void main(String[] args) {
        OuterClass3 outerClass3 = new OuterClass3();
        outerClass3.print();
    }
}
