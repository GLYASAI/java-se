package org.abewang.javase.primitive;

/**
 * @Author Abe
 * @Date 2018/7/5.
 */
public class IntState implements ValueState {

    @Override
    public void printValueRange() {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        int size = Integer.SIZE;
        String name = "int";

        System.out.println(name + "最大值是  : " + max);
        System.out.println(name + "最大值+1是: " + (max + 1));
        System.out.println(name + "最大值是(二进制)  : " + getIntBinary(max, size));
        System.out.println(name + "最大值+1是(二进制): " + getIntBinary((min + 1), size));

        System.out.println();

        System.out.println(name + "最小值是  : " + min);
        System.out.println(name + "最小值+1是: " + (min - 1));
        System.out.println(name + "最小值是(二进制)  : " + getIntBinary(min, size));
        System.out.println(name + "最小值+1是(二进制): " + getIntBinary((min - 1), size));

        System.out.println("----------------------------------------------------------------");
        System.out.println();
    }
}
