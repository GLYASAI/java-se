package org.abewang.javase.serialization;

/**
 * @Author Abe
 * @Date 2018/7/6.
 */
public class Consumer {
    public static void main(String[] args) {
        Person person = (Person) SerializationUtils.readObject();
        System.out.println(person.getName());
    }
}
