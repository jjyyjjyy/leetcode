package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class MonotonicArrayTest {

    private static final MonotonicArray MONOTONIC_ARRAY = new MonotonicArray();

    @ParameterizedTest
    @CsvSource({"'1,2,2,3',true", "'6,5,4,4',true", "'1,3,2',false", "'1,2,4,5',true", "'1,1,1',true", "'5,3,2,4,1',false", "'1,1,0',true"})
    void isMonotonic(@ConvertWith(CsvToArray.class) int[] A, boolean expect) {
        assertEquals(expect, MONOTONIC_ARRAY.isMonotonic(A));
    }
}
