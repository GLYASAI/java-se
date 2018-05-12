package org.abewang.generic;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

/**
 * @Author Abe
 * @Date 2018/5/12.
 */
class ThreeTupleTest {
    private static final Logger LOGGER = LogManager.getLogger(ThreeTupleTest.class);

    class Dog {
    }

    class Cat {
    }

    @Test
    void threeTupleTest() {
        ThreeTuple<Dog, Cat, Integer> threeTuple = new ThreeTuple<>(new Dog(), new Cat(), 0);
        LOGGER.info(threeTuple.toString());
    }
}
