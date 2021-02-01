package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class FairCandySwapTest {

    private static final FairCandySwap FAIR_CANDY_SWAP = new FairCandySwap();

    @ParameterizedTest
    @CsvSource({"'1,1','2,2','1,2'", "'1,2','2,3','1,2'", "'2','1,3','2,3'", "'1,2,5','2,4','5,4'"})
    void fairCandySwap(@ConvertWith(CsvToArray.class) int[] A,
                       @ConvertWith(CsvToArray.class) int[] B,
                       @ConvertWith(CsvToArray.class) int[] expect) {
        Assertions.assertArrayEquals(expect, FAIR_CANDY_SWAP.fairCandySwap(A, B));
    }
}
