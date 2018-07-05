package org.abewang.javase.oop;

import org.abewang.javase.oop.enumerate.Gender;
import org.abewang.javase.oop.enumerate.Season;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @Author Abe
 * @Date 2018/5/18.
 */
public class EnumerateTest {
    @Test
    void testSeasonEnumValues() {
        for (Season season : Season.values()) {
            System.out.println(season);
        }
    }

    @Test
    void testGender() {
        Assertions.assertEquals("男", Gender.MALE.getName());
        assertEquals("女", Gender.FEMALE.getName());
    }
}
