package org.abewang.javase.primitive;

/**
 * @Author Abe
 * @Date 2018/7/5.
 */
public class ByteState implements ValueState {
    @Override
    public void printValueRange() {
        byte max = Byte.MAX_VALUE;
        byte min = Byte.MIN_VALUE;
        int size = Byte.SIZE;
        String name = "byte";

        System.out.println(name + "最大值是  : " + max);
        System.out.println(name + "最大值+1是: " + (byte) (max + 1));
        System.out.println(name + "最大值是(二进制)  : " + getIntBinary(max, size));
        System.out.println(name + "最大值+1是(二进制): " + getIntBinary((byte) (max + 1), size));

        System.out.println();

        System.out.println(name + "最小值是  : " + min);
        System.out.println(name + "最小值+1是: " + (byte) (min - 1));
        System.out.println(name + "最小值是(二进制)  : " + getIntBinary(min, size));
        System.out.println(name + "最小值+1是(二进制): " + getIntBinary((byte) (max - 1), size));
        System.out.println("----------------------------------------------------------------");
    }
}
