package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class ArrayPartitionITest {

    private static final ArrayPartitionI ARRAY_PARTITION_I = new ArrayPartitionI();

    @ParameterizedTest
    @CsvSource({"'1,4,3,2',4", "'6,2,6,5,1,2',9"})
    void arrayPairSum(@ConvertWith(CsvToArray.class) int[] nums, int expect) {
        assertEquals(expect, ARRAY_PARTITION_I.arrayPairSum(nums));
    }
}
