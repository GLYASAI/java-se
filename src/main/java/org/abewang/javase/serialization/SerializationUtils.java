package org.abewang.javase.serialization;

import java.io.*;

/**
 * @Author Abe
 * @Date 2018/7/6.
 */
public class SerializationUtils {
    private static final String FILE_NAME = "c:/tmp/Abe/obj.bin";

    public static void writeObject(Serializable s) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
            oos.writeObject(s);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object readObject() {
        Object obj = null;
        try {
            ObjectInput input = new ObjectInputStream(new FileInputStream(FILE_NAME));
            obj = input.readObject();
            input.close();
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }
}
