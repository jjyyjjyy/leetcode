package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class SuperUglyNumberTest {

    private static final SuperUglyNumber SUPER_UGLY_NUMBER = new SuperUglyNumber();

    @ParameterizedTest
    @CsvSource({"12,'2,7,13,19',32"})
    void nthSuperUglyNumber(int n, @ConvertWith(CsvToArray.class) int[] primes, int expect) {
        assertEquals(expect, SUPER_UGLY_NUMBER.nthSuperUglyNumber(n, primes));
    }
}
