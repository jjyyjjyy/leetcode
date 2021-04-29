package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class FrogJumpTest {

    private static final FrogJump FROG_JUMP = new FrogJump();

    @ParameterizedTest
    @CsvSource({"'0,1,3,5,6,8,12,17',true", "'0,1,2,3,4,8,9,11',false"})
    void canCross(@ConvertWith(CsvToArray.class) int[] stones, boolean expect) {
        assertEquals(expect, FROG_JUMP.canCross(stones));
    }
}
