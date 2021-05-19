package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class FindKthLargestXorCoordinateValueTest {

    private static final FindKthLargestXorCoordinateValue FIND_KTH_LARGEST_XOR_COORDINATE_VALUE = new FindKthLargestXorCoordinateValue();

    @ParameterizedTest
    @CsvSource({"'[5,2],[1,6]',1,7", "'[5,2],[1,6]',2,5", "'[5,2],[1,6]',3,4", "'[5,2],[1,6]',4,0"})
    void kthLargestValue(@ConvertWith(CsvToArray.class) int[][] matrix, int k, int expect) {
        assertEquals(expect, FIND_KTH_LARGEST_XOR_COORDINATE_VALUE.kthLargestValue(matrix, k));
    }
}
