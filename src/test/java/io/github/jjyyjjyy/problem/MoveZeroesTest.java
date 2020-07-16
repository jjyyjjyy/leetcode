package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class MoveZeroesTest {

    private static final MoveZeroes MOVE_ZEROES = new MoveZeroes();

    @ParameterizedTest
    @CsvSource({"'0,1,0,23,12','1,23,12,0,0'"})
    void moveZeroes(@ConvertWith(CsvToArray.class) int[] arr,
                    @ConvertWith(CsvToArray.class) int[] expect) {
        MOVE_ZEROES.moveZeroes(arr);
        Assertions.assertArrayEquals(expect, arr);
    }
}
