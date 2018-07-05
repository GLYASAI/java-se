package org.abewang.javase.primitive;

/**
 * @Author Abe
 * @Date 2018/7/5.
 */
public class LongState implements ValueState {
    @Override
    public void printValueRange() {
        long max = Long.MAX_VALUE;
        long min = Long.MIN_VALUE;
        String name = "long";

        System.out.println(name + "最大值是  : " + max);
        System.out.println(name + "最大值+1是: " + (long)(max + 1));
        System.out.println(name + "最大值是(二进制)  : 0" + Long.toBinaryString(max));
        System.out.println(name + "最大值+1是(二进制): " + Long.toBinaryString(max + 1));

        System.out.println();

        System.out.println(name + "最小值是  : " + min);
        System.out.println(name + "最小值+1是: " + (min - 1));
        System.out.println(name + "最小值是(二进制)  : " + Long.toBinaryString(min));
        System.out.println(name + "最小值+1是(二进制): 0" + Long.toBinaryString(min - 1));

        System.out.println("----------------------------------------------------------------");
        System.out.println();
    }
}
