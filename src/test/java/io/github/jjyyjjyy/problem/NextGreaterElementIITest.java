package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class NextGreaterElementIITest {

    private static final NextGreaterElementII NEXT_GREATER_ELEMENT_II = new NextGreaterElementII();

    @ParameterizedTest
    @CsvSource({"'1,2,1','2,-1,2'"})
    void nextGreaterElements(@ConvertWith(CsvToArray.class) int[] nums,
                             @ConvertWith(CsvToArray.class) int[] expect) {
        Assertions.assertArrayEquals(expect, NEXT_GREATER_ELEMENT_II.nextGreaterElements(nums));
    }
}
