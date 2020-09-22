package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class HappyNumberTest {

    private static final HappyNumber HAPPY_NUMBER = new HappyNumber();

    @ParameterizedTest
    @CsvSource({"19,true"})
    void isHappy(int n, boolean expect) {
        assertEquals(expect, HAPPY_NUMBER.isHappy(n));
    }
}
