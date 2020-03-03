package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author jy
 */
class TwoSumTest {

    private TwoSum twoSum = new TwoSum();

    @ParameterizedTest
    @CsvSource({"'2,7,11,15',9,'0,1'", "'11,15,2,7',9,'2,3'"})
    void twoSum(@ConvertWith(CsvToArray.class) int[] param1,
                int param2,
                @ConvertWith(CsvToArray.class) int[] result) {
        assertArrayEquals(result, twoSum.twoSum(param1, param2));
    }

    @Test
    void twoSum2() {
        assertArrayEquals(new int[]{0, 1}, twoSum.twoSum2(new int[]{2, 7, 11, 15}, 9));
        assertArrayEquals(new int[]{2, 3}, twoSum.twoSum2(new int[]{11, 15, 2, 7}, 9));
    }
}
