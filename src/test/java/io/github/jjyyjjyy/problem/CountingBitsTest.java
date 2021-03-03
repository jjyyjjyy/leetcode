package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author jy
 */
class CountingBitsTest {

    private static final CountingBits COUNTING_BITS = new CountingBits();

    @ParameterizedTest
    @CsvSource({"2,'0,1,1'", "5,'0,1,1,2,1,2'"})
    void countBits(int num, @ConvertWith(CsvToArray.class) int[] expect) {
        assertArrayEquals(expect, COUNTING_BITS.countBits(num));
    }
}
