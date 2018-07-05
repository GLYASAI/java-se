package org.abewang.javase.io;

import java.io.*;

/**
 * @Author Abe
 * @Date 2018/6/14.
 */
public class StoringAndRecoveringData15 {
    static String file = "StoringAndRecoveringData15.out";
    public static void main(String[] args) throws IOException {
        DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
        byte[] b = {'a', 'b', 'c', 'd'};
        out.write(b, 0, 2);
        out.write(b);
        out.write(255);
        out.writeBoolean(true);
        out.writeByte(97);
        out.writeBytes("hi");
        out.writeChar(120);
        out.writeChars("hi");
        out.writeDouble(3.14159);
        out.writeFloat(1.57f);
        out.writeInt(999);
        out.writeLong(1000L);
        out.writeShort(123);
        out.writeUTF("是真的难!");
        out.close();

        DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
        byte[] bIn = new byte[4];
        System.out.println("in.read(bIn, 0, 2) = " + in.read(bIn, 0, 2));
        System.out.println("bIn = ");
        for (int i = 0; i < bIn.length; i++) {
            System.out.print(bIn[i]);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("in.read(bIn) = " + in.read(bIn));
        System.out.println("bIn = ");
        for (int i = 0; i < bIn.length; i++) {
            System.out.print(bIn[i]);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("in.read() = " + in.read());
        System.out.println("in.readBoolean() = " + in.readBoolean());
        System.out.println("in.readByte() = " + in.readByte());
        System.out.println("in.read() = " + in.read());
        System.out.println("in.read() = " + in.read());
        System.out.println("in.readChar() = " + in.readChar());
        System.out.println("in.readChar() = " + in.readChar());
        System.out.println("in.readChar() = " + in.readChar());
        System.out.println("in.readDouble() = " + in.readDouble());
        System.out.println("in.readFloat() = " + in.readFloat());
        System.out.println("in.readInt() = " + in.readInt());
        System.out.println("in.readLong() = " + in.readLong());
        System.out.println("in.readShort() = " + in.readShort());
        System.out.println("in.readUTF() = " + in.readUTF());
    }
}
