package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class MergeSortedArrayTest {

    private MergeSortedArray mergeSortedArray = new MergeSortedArray();

    @ParameterizedTest
    @CsvSource({"'1,2,3,0,0,0',3,'2,5,6',3,'1,2,2,3,5,6'", "'0',0,'1',1,'1'"})
    void merge(@ConvertWith(CsvToArray.class) int[] param1, int param2,
               @ConvertWith(CsvToArray.class) int[] param3, int param4,
               @ConvertWith(CsvToArray.class) int[] result) {
        mergeSortedArray.merge(param1, param2, param3, param4);
        Assertions.assertArrayEquals(result, param1);
    }
}
