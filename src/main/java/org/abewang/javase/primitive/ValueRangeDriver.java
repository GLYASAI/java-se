package org.abewang.javase.primitive;

/**
 * @Author Abe
 * @Date 2018/7/5.
 */
public class ValueRangeDriver {
    private ValueState state;

    public void setState(ValueState state) {
        this.state = state;
    }

    public void printValueRange() {
        state.printValueRange();
    }

    public static void main(String[] args) {
        ValueRangeDriver driver = new ValueRangeDriver();

        driver.setState(new ByteState(driver));
        driver.printValueRange();

        driver.setState(new ShortState(driver));
        driver.printValueRange();

        driver.setState(new IntState(driver));
        driver.printValueRange();

        driver.setState(new LongState(driver));
        driver.printValueRange();
    }
}
