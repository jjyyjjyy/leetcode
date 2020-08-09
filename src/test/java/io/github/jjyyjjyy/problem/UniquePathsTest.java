package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class UniquePathsTest {

    private static final UniquePaths UNIQUE_PATHS = new UniquePaths();

    @ParameterizedTest
    @CsvSource({"3,2,3", "7,3,28"})
    void uniquePaths(int m, int n, int expect) {
        assertEquals(expect, UNIQUE_PATHS.uniquePaths(m, n));
    }
}
