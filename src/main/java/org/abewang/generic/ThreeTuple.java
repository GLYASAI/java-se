package org.abewang.generic;

/**
 * @Author Abe
 * @Date 2018/5/12.
 */
public class ThreeTuple<A, B, C> {
    public final A first;

    public final B second;


    public final C third;

    public ThreeTuple(A first, B second, C third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    @Override
    public String toString() {
        return "ThreeTuple{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                '}';
    }
}
