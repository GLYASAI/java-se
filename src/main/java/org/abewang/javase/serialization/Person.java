package org.abewang.javase.serialization;

import java.io.Serializable;

/**
 * @Author Abe
 * @Date 2018/7/6.
 */
public class Person implements Serializable {
    /**
     * 如果不显示声明serialVersionUID, 当Person类发生变化时, 反序列化会报InvalidClassException
     */
    private static final long serialVersionUID = 1L;

    private String name;

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
