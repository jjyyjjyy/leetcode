package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static io.github.jjyyjjyy.util.ArrayUtil.toIntArray;

/**
 * @author jy
 */
class FindAllNumbersDisappearedInAnArrayTest {

    private static final FindAllNumbersDisappearedInAnArray FIND_ALL_NUMBERS_DISAPPEARED_IN_AN_ARRAY = new FindAllNumbersDisappearedInAnArray();

    @ParameterizedTest
    @CsvSource({"'4,3,2,7,8,2,3,1','5,6'"})
    void findDisappearedNumbers(@ConvertWith(CsvToArray.class) int[] arr, @ConvertWith(CsvToArray.class) int[] expect) {
        Assertions.assertArrayEquals(expect, toIntArray(FIND_ALL_NUMBERS_DISAPPEARED_IN_AN_ARRAY.findDisappearedNumbers(arr)));
    }
}
