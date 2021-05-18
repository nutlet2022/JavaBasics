package com.javabasic.buffertest;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class BufferTest {
    public static void main(String[] args) {
        Writer writer = null;
        BufferedWriter bufferedWriter = null;

        try {
            writer = new FileWriter("file.txt");
            bufferedWriter = new BufferedWriter(writer);

            long num = 20_0000;
            long beginTime = System.currentTimeMillis();
            for (int i =0; i < num; i++) {
                bufferedWriter.write(i);
            }

            long endTime = System.currentTimeMillis();
            System.out.println(endTime - beginTime);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
