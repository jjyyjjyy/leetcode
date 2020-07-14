package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class ContainsDuplicateTest {

    private static final ContainsDuplicate CONTAINS_DUPLICATE = new ContainsDuplicate();

    @ParameterizedTest
    @CsvSource({"'1,1,2', true", "'1,2,3,1', true", "'1,2,3,4', false", "'1,1,1,3,3,4,3,2,4,2', true"})
    void containsDuplicate(@ConvertWith(CsvToArray.class) int[] arr, boolean expect) {
        assertEquals(expect, CONTAINS_DUPLICATE.containsDuplicate(arr));
    }
}
