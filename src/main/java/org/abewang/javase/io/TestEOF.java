package org.abewang.javase.io;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Author Abe
 * @Date 2018/6/14.
 */
public class TestEOF {
    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(new BufferedInputStream(
                new FileInputStream("src/main/java/org/abewang/io/TestEOF.java")));
        while (in.available() != 0) {
            System.out.println((char) in.read());
        }
    }
}
