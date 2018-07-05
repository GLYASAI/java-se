package org.abewang.javase.serialization;

/**
 * @Author Abe
 * @Date 2018/7/6.
 */
public class Producer {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("AbeWang");
        SerializationUtils.writeObject(person);
    }
}
