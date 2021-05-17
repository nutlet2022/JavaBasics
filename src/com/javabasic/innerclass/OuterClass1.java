package com.javabasic.innerclass;

public class OuterClass1 {

    private String outerName;

    public void print() {
        System.out.println("Outer Class");
        System.out.println(outerName);
    }


    public class InnerClass {
        private String innerName;

        public InnerClass() {
            innerName = "inner name";
        }
        public void print() {
            System.out.println("Inner Class");
            System.out.println(innerName);
        }
    }

    public static void main(String[] args) {
        OuterClass1 outerClass = new OuterClass1();
        outerClass.print();

        //非静态的内部类，直接静态方法访问不行
        InnerClass innerClass = outerClass.new InnerClass();
        /** 以下写法也可以 */
        //OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.print();
    }
}
