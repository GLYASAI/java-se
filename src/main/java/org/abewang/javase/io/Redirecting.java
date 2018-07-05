package org.abewang.javase.io;

import java.io.*;

/**
 * @Author Abe
 * @Date 2018/6/16.
 */
public class Redirecting {
    public static void main(String[] args) throws IOException {
        PrintStream console = System.out;
        BufferedInputStream in = new BufferedInputStream(
                new FileInputStream("src/main/java/" +
                        Redirecting.class.getName().replace(".", "/") + ".java"));
        PrintStream out = new PrintStream(new BufferedOutputStream(new FileOutputStream("redirecting.out")));
        System.setIn(in);
        System.setOut(out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while((s = br.readLine()) != null) {
            System.out.println(s);
        }
        out.close();
        System.setOut(console);
    }
}
