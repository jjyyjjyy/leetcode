package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class DetectCapitalTest {

    private static final DetectCapital DETECT_CAPITAL = new DetectCapital();

    @ParameterizedTest
    @CsvSource({"USA,true", "FlaG,false", "mL, false", "FFFFFFFFFFFFFFFFFFFFf,false"})
    void detectCapitalUse(String s, boolean expect) {
        assertEquals(expect, DETECT_CAPITAL.detectCapitalUse(s));
    }
}
