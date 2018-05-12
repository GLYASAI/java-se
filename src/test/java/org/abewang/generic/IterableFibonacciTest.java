package org.abewang.generic;

import org.junit.jupiter.api.Test;

import java.util.Iterator;

/**
 * @Author Abe
 * @Date 2018/5/12.
 */
public class IterableFibonacciTest {
    @Test
    void iterableFibonacciTest() {
        IterableFibonacci iterF = new IterableFibonacci(18);
        Iterator iter = iterF.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
