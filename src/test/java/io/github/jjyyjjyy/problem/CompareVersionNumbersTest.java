package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class CompareVersionNumbersTest {

    private static final CompareVersionNumbers COMPARE_VERSION_NUMBERS = new CompareVersionNumbers();

    @ParameterizedTest
    @CsvSource({"0.1,1.1,-1", "1.0.1,1,1", "7.5.2.4,7.5.3,-1", "1.01,1.001,0", "1.0,1.0.0,0"})
    void compareVersion(String version1, String version2, int expect) {
        assertEquals(expect, COMPARE_VERSION_NUMBERS.compareVersion(version1, version2));

    }
}
