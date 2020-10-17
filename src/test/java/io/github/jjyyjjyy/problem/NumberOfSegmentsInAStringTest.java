package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class NumberOfSegmentsInAStringTest {

    private static final NumberOfSegmentsInAString NUMBER_OF_SEGMENTS_IN_A_STRING = new NumberOfSegmentsInAString();

    @ParameterizedTest
    @CsvSource({"'',0", "', , , ,        a, eaefa',6", "a,1", "'Hello, my name is John',5"})
    void countSegments(String s, int expect) {
        assertEquals(expect, NUMBER_OF_SEGMENTS_IN_A_STRING.countSegments(s));
    }
}
