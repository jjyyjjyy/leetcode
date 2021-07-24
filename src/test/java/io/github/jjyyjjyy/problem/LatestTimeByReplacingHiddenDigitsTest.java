package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class LatestTimeByReplacingHiddenDigitsTest {

    private static final LatestTimeByReplacingHiddenDigits LATEST_TIME_BY_REPLACING_HIDDEN_DIGITS = new LatestTimeByReplacingHiddenDigits();

    @ParameterizedTest
    @CsvSource({"2?:?0,23:50", "0?:3?,09:39", "1?:22,19:22"})
    void maximumTime(String time, String expect) {
        assertEquals(expect, LATEST_TIME_BY_REPLACING_HIDDEN_DIGITS.maximumTime(time));
    }
}
