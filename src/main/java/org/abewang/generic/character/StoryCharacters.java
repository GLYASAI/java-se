package org.abewang.generic.character;

/**
 * @Author Abe
 * @Date 2018/5/12.
 */
public class StoryCharacters {
    private String simpleClassName = getClass().getSimpleName();
    private final String type = simpleClassName.length() % 2 == 0 ? "GoodGuys" : "BadGuys";

    @Override
    public String toString() {
        return simpleClassName + ", " + type;
    }
}
