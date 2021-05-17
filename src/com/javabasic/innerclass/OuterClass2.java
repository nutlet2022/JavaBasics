package com.javabasic.innerclass;

public class OuterClass2 {

    private String outerName;

    public static class InnerClass {
        private String innerName;

        public InnerClass() {
            innerName = "inner Name";
        }


        public void print() {
            System.out.println("Inner Class");
            System.out.println(innerName);
        }
    }

    public void print() {
        System.out.println("Outer Class");
        System.out.println(outerName);
    }


    public static void main(String[] args) {
        OuterClass2 outerClass2 = new OuterClass2();
        outerClass2.print();

        OuterClass2.InnerClass innerClass = new InnerClass();
        InnerClass innerClass1 = new InnerClass();
        innerClass.print();
        innerClass1.print();

    }
}
