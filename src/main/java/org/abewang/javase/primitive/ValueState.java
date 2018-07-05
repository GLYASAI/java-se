package org.abewang.javase.primitive;

/**
 * @Author Abe
 * @Date 2018/7/5.
 */
public interface ValueState {

    void printValueRange();

    default <T extends Number> String getIntBinary(T number, int size) {
        int i = number.intValue();
        StringBuilder result = new StringBuilder();
        for(int j = size - 1; j >= 0; j-- ) {
            if( ( (1 << j) &  i) != 0){
                result.append("1");
            } else {
                result.append("0");
            }
        }
        return result.toString();
    }
}
