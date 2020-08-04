package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class JumpGameTest {

    private static final JumpGame JUMP_GAME = new JumpGame();

    @ParameterizedTest
    @CsvSource({"'2,3,1,1,4',true", "'3,2,1,0,4',false"})
    void canJump(@ConvertWith(CsvToArray.class) int[] arr, boolean expect) {
        assertEquals(expect, JUMP_GAME.canJump(arr));
    }
}
