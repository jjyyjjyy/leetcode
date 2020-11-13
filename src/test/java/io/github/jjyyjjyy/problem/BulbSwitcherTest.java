package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class BulbSwitcherTest {

    private static final BulbSwitcher BULB_SWITCHER = new BulbSwitcher();

    @ParameterizedTest
    @CsvSource({"0,0", "1,1", "3,1"})
    void bulbSwitch(int n, int expect) {
        assertEquals(expect, BULB_SWITCHER.bulbSwitch(n));
    }
}
