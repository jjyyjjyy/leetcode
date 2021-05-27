package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class HammingDistanceTest {

    private static final HammingDistance HAMMING_DISTANCE = new HammingDistance();

    @ParameterizedTest
    @CsvSource({"1,4,2"})
    void hammingDistance(int x, int y, int expect) {
        assertEquals(expect, HAMMING_DISTANCE.hammingDistance(x, y));
    }
}
