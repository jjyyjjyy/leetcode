package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class FindTheDuplicateNumberTest {

    private static final FindTheDuplicateNumber FIND_THE_DUPLICATE_NUMBER = new FindTheDuplicateNumber();

    @ParameterizedTest
    @CsvSource({"'1,3,4,2,2',2", "'3,1,3,4,2',3"})
    void findDuplicate(@ConvertWith(CsvToArray.class) int[] nums, int expect) {
        Assertions.assertEquals(expect, FIND_THE_DUPLICATE_NUMBER.findDuplicate(nums));
    }
}
