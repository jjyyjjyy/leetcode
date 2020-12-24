package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class FirstBadVersionTest {

    private static final FirstBadVersion FIRST_BAD_VERSION = new FirstBadVersion();

    @ParameterizedTest
    @CsvSource({"5,4"})
    void firstBadVersion(int n, int expect) {
        assertEquals(expect, FIRST_BAD_VERSION.firstBadVersion(n));
    }
}
