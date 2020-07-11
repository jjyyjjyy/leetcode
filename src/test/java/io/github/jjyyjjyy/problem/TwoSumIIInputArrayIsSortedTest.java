package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author jy
 */
class TwoSumIIInputArrayIsSortedTest {

    private static final TwoSumIIInputArrayIsSorted TWO_SUM_II_INPUT_ARRAY_IS_SORTED = new TwoSumIIInputArrayIsSorted();

    @ParameterizedTest
    @CsvSource({"'2,7,11,15',9,'1,2'"})
    void twoSum(@ConvertWith(CsvToArray.class) int[] arr,
                int target,
                @ConvertWith(CsvToArray.class) int[] expect) {
        assertArrayEquals(expect, TWO_SUM_II_INPUT_ARRAY_IS_SORTED.twoSum(arr, target));

    }
}
