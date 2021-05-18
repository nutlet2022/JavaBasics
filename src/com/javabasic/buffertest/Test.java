package com.javabasic.buffertest;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Test {
    public static void main(String[] args) {
        Writer writer = null;

        try {
            writer = new FileWriter("file.txt");
            long num = 10_0000;
            long beginTime = System.currentTimeMillis();

            for (int i = 0; i < num; i++) {
                writer.write(i);
            }

            long endTime = System.currentTimeMillis();
            System.out.println(endTime - beginTime);

        } catch (IOException ioException) {
            ioException.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}