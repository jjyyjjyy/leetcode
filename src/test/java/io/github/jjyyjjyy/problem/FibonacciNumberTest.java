package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class FibonacciNumberTest {

    private static final FibonacciNumber FIBONACCI_NUMBER = new FibonacciNumber();

    @ParameterizedTest
    @CsvSource({"2,1", "3,2", "4,3"})
    void fib(int n, int expect) {
        assertEquals(expect, FIBONACCI_NUMBER.fib(n));
    }
}
