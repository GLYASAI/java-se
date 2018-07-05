package org.abewang.javase.io;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;

/**
 * @Author Abe
 * @Date 2018/6/14.
 */
public class FormattedMemoryInput {
    public static void main(String[] args) throws IOException {
        try {
            DataInputStream in = new DataInputStream(new ByteArrayInputStream(
                    BufferedInputFile.read("src/main/java/org/abewang/io/FormattedMemoryInput.java").getBytes()));
            while (true) {
                System.out.println((char)in.readByte());
            }
        } catch (EOFException e) {
            System.err.println("End of stream.");
        }
    }
}
