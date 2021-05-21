package com.javabasic.annotationtest;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("com.javabasic.annotationtest.MyAnnotationDemo");

        //判断类是否添加注解
        Annotation annotation = clazz.getAnnotation(MyAnnotationDemo.class);
        System.out.println(annotation);

        Method[] methods = clazz.getMethods();
        if (methods != null) {
            for (Method method : methods) {
                boolean annotationPresent = method.isAnnotationPresent(MyAnnotation.class);
//                System.out.println(method.getName() + " : " +annotationPresent);
                if (annotationPresent) {
                    //反射机制，执行方法
                    method.invoke(clazz.getConstructor(null).newInstance(null),null);
                }
            }
        }
    }
}
