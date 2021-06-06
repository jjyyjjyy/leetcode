package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class OnesAndZeroesTest {

    private static final OnesAndZeroes ONES_AND_ZEROES = new OnesAndZeroes();

    @ParameterizedTest
    @CsvSource({"'10,0001,111001,1,0',5,3,4", "'10,0,1',1,1,2"})
    void findMaxForm(@ConvertWith(CsvToArray.class) String[] strs, int m, int n, int expect) {
        assertEquals(expect, ONES_AND_ZEROES.findMaxForm(strs, m, n));
    }
}
