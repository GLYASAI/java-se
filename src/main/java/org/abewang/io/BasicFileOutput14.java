package org.abewang.io;

import java.io.*;

/**
 * @Author Abe
 * @Date 2018/6/14.
 */
public class BasicFileOutput14 {
    static String file = "BasicFileOutput14.out";
    static String file2 = "BasicFileOutput14_2.out";

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(BufferedInputFile.read("src/main/java/"
                + BasicFileOutput14.class.getName().replace(".", "/") + ".java")));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
        String s;
        long start = System.nanoTime();
        while ((s = in.readLine()) != null) {
            out.println(s);
        }
        long duration = System.nanoTime() - start;
        out.close();

        BufferedReader in2 = new BufferedReader(new StringReader(BufferedInputFile.read("src/main/java/"
                + BasicFileOutput14.class.getName().replace(".", "/") + ".java")));
        PrintWriter out2 = new PrintWriter(new FileWriter(file2));
        String s2;
        long start2 = System.nanoTime();
        while ((s2 = in2.readLine()) != null) {
            out2.println(s2);
        }
        long duration2 = System.nanoTime() - start2;
        out2.close();

        System.out.println("Buffer time: " + duration + " nanoSeconds");
        System.out.println("No buffer time: " + duration2 + " nanoSeconds");
    }
}
