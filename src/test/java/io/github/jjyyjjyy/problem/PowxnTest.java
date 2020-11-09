package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class PowxnTest {

    private static final Powxn POWXN = new Powxn();

    @ParameterizedTest
    @CsvSource({"2,10,1024", "2.1,3,9.261", "2,-2,0.25", "2,-2147483648,0"})
    void myPow(double x, int n, double expect) {
        assertEquals(expect, BigDecimal.valueOf(POWXN.myPow(x, n)).setScale(4, RoundingMode.HALF_UP).doubleValue());
    }
}
