package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author jy
 */
class XorQueriesOfASubarrayTest {

    private static final XorQueriesOfASubarray XOR_QUERIES_OF_A_SUBARRAY = new XorQueriesOfASubarray();

    @ParameterizedTest
    @CsvSource({"'1,3,4,8','[0,1],[1,2],[0,3],[3,3]','2,7,14,8'", "'4,8,2,10','[2,3],[1,3],[0,0],[0,3]','8,0,4,4'"})
    void xorQueries(@ConvertWith(CsvToArray.class) int[] arr,
                    @ConvertWith(CsvToArray.class) int[][] queries,
                    @ConvertWith(CsvToArray.class) int[] expect) {
        assertArrayEquals(expect, XOR_QUERIES_OF_A_SUBARRAY.xorQueries(arr, queries));
    }
}
