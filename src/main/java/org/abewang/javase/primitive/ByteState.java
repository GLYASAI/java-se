package org.abewang.javase.primitive;

/**
 * @Author Abe
 * @Date 2018/7/5.
 */
public class ByteState implements ValueState {
    private ValueRangeDriver driver;

    public ByteState(ValueRangeDriver driver) {
        this.driver = driver;
    }

    @Override
    public void printValueRange() {
        byte max = Byte.MAX_VALUE;
        byte min = Byte.MIN_VALUE;
        String name = "byte";

        System.out.println(name + "最大值是  : " + max);
        System.out.println(name + "最大值+1是: " + (byte) (max + 1));
        System.out.println(name + "最大值是(二进制)  : 0" + Integer.toBinaryString(max));
        String maxBinaryStr = Integer.toBinaryString((byte)(max + 1));
        System.out.println(name + "最大值+1是(二进制): " + maxBinaryStr.substring(maxBinaryStr.length() - 8));

        System.out.println();

        System.out.println(name + "最小值是  : " + min);
        System.out.println(name + "最小值+1是: " + (byte) (min - 1));
        String minBinaryStr = Integer.toBinaryString(min);
        System.out.println(name + "最小值是(二进制)  : " + minBinaryStr.substring(minBinaryStr.length() - 8));
        System.out.println(name + "最小值+1是(二进制): 0" + Integer.toBinaryString((byte) (min - 1)));
        System.out.println("----------------------------------------------------------------");
    }
}
