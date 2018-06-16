package org.abewang.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author Abe
 * @Date 2018/6/7.
 */
public class BufferedInputFile {
    public static String read(String filename) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String s;
        StringBuilder sb = new StringBuilder();
        while ((s = in.readLine()) != null) {
            sb.append(s + "\n");
        }
        in.close();
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        System.out.println(BufferedInputFile.class.getResource(""));
        System.out.println(BufferedInputFile.class.getResource("/"));
        System.out.println(Thread.currentThread().getContextClassLoader().getResource(""));
        System.out.println(BufferedInputFile.class.getClassLoader().getResource(""));
        System.out.println(ClassLoader.getSystemResource(""));
        System.out.println(read("src/main/java/org/abewang/io/BufferedInputFile.java"));

        File file = new File("");
        System.out.println(file.getPath());
        System.out.println(file.getCanonicalPath());
        System.out.println(file.getAbsolutePath());
    }
}
