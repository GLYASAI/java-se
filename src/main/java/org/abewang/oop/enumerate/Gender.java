package org.abewang.oop.enumerate;

/**
 * @Author Abe
 * @Date 2018/5/19.
 */
public enum Gender {
    /**
     * 男人
     */
    MALE("男"),
    /**
     * 女人
     */
    FEMALE("女");

    private final String name;

    Gender(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}