package org.abewang.javase.io;

import java.io.IOException;
import java.io.StringReader;

/**
 * @Author Abe
 * @Date 2018/6/14.
 */
public class MemoryInput {
    public static void main(String[] args) throws IOException {
        StringReader stringReader = new StringReader(
                BufferedInputFile.read("src/main/java/org/abewang/io/MemoryInput.java"));
        int c;
        while ((c = stringReader.read()) != -1) {
            System.out.println((char) c);
        }
    }
}
