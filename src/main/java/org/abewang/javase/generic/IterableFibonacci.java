package org.abewang.javase.generic;

import java.util.Iterator;

/**
 * 练习7：使用组合代替继承，适配Fibonacci使其成为Iterable
 *
 * @Author Abe
 * @Date 2018/5/12.
 */
public class IterableFibonacci implements Iterable<Integer> {
    private Integer n;
    private Fibonacci fibonacci = new Fibonacci();

    public IterableFibonacci(Integer n) {
        this.n = n;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return n > 0;
            }

            @Override
            public Integer next() {
                n--;
                return fibonacci.next();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}
