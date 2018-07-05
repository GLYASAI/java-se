package org.abewang.javase.primitive;

/**
 * @Author Abe
 * @Date 2018/7/5.
 */
public class ShortState implements ValueState {

    @Override
    public void printValueRange() {
        short max = Short.MAX_VALUE;
        short min = Short.MIN_VALUE;
        int size = Short.SIZE;
        String name = "short";

        System.out.println(name + "最大值是  : " + max);
        System.out.println(name + "最大值+1是: " + (short) (max + 1));
        System.out.println(name + "最大值是(二进制)  : " + getIntBinary(max, size));
        System.out.println(name + "最大值+1是(二进制): " + getIntBinary((short) (max + 1), size));

        System.out.println();

        System.out.println(name + "最小值是  : " + min);
        System.out.println(name + "最小值+1是: " + (short) (min - 1));
        System.out.println(name + "最小值是(二进制)  : " + getIntBinary(min, size));
        System.out.println(name + "最小值+1是(二进制): " + getIntBinary((short) (min - 1), size));
        System.out.println("----------------------------------------------------------------");
    }
}
