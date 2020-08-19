package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class SortColorsTest {

    private static final SortColors SORT_COLORS = new SortColors();

    @ParameterizedTest
    @CsvSource({"'2,0,2,1,1,0','0,0,1,1,2,2'"})
    void sortColors(@ConvertWith(CsvToArray.class) int[] nums,
                    @ConvertWith(CsvToArray.class) int[] expect) {
        SORT_COLORS.sortColors(nums);
        Assertions.assertArrayEquals(expect, nums);
    }
}
