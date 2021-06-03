package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class ContiguousArrayTest {

    private static final ContiguousArray CONTIGUOUS_ARRAY = new ContiguousArray();

    @ParameterizedTest
    @CsvSource({"'0,1',2", "'0,1,0',2"})
    void findMaxLength(@ConvertWith(CsvToArray.class) int[] nums, int expect) {
        assertEquals(expect, CONTIGUOUS_ARRAY.findMaxLength(nums));
    }
}
