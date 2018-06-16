package org.abewang.io;

import java.io.*;

/**
 * @Author Abe
 * @Date 2018/6/14.
 */
public class BasicFileOutput {
    static String file = "BasicFileOutput.out";

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(BufferedInputFile.read(
                "src/main/java/"
                        + BasicFileOutput.class.getName().replace(".", "/") + ".java")));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
        int lineNumber = 1;
        String s;
        while ((s = in.readLine()) != null) {
            out.println(lineNumber++ + ":" + s);
        }
        out.close();

        System.out.println(BufferedInputFile.read(file));
    }
}
