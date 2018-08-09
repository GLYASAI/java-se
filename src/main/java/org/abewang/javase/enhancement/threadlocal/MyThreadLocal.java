package org.abewang.javase.enhancement.threadlocal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 * @Author Abe
 * @Date 2018/8/9.
 */
public class MyThreadLocal<T> {
    private Map<Thread, T> container = Collections.synchronizedMap(new HashMap<>());

    public T get() {
        T value = container.get(Thread.currentThread());
        if (value == null && !container.containsKey(Thread.currentThread())) {
            value = initialValue();
            container.put(Thread.currentThread(), value);
        }
        return value;
    }

    protected T initialValue() {
        return null;
    }

    public void set(T value) {
        container.put(Thread.currentThread(), value);
    }
}
