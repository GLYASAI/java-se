package org.abewang.str;

import java.util.HashMap;

/**
 * @Author Abe
 * @Date 2018/6/9.
 */
public class Foo {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString((-32)));
        System.out.println(Integer.toBinaryString((-32 >> 4)));
        System.out.println(Integer.toBinaryString((-32 >>> 4)));

        new HashMap<>();
    }
}
