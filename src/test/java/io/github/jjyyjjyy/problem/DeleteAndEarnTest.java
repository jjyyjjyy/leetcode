package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class DeleteAndEarnTest {

    private static final DeleteAndEarn DELETE_AND_EARN = new DeleteAndEarn();

    @ParameterizedTest
    @CsvSource({"'3,4,2',6", "'2,2,3,3,3,4',9"})
    void deleteAndEarn(@ConvertWith(CsvToArray.class) int[] nums, int expect) {
        assertEquals(expect, DELETE_AND_EARN.deleteAndEarn(nums));
    }
}
