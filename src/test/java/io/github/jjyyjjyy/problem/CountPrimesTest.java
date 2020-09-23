package io.github.jjyyjjyy.problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class CountPrimesTest {

    private static final CountPrimes COUNT_PRIMES = new CountPrimes();

    @ParameterizedTest
    @CsvSource({"10,4", "2,0", "3,1"})
    void countPrimes(int n, int expect) {
        Assertions.assertEquals(expect, COUNT_PRIMES.countPrimes(n));
    }
}
