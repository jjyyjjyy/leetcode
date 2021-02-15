package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class CouplesHoldingHandsTest {

    private static final CouplesHoldingHands COUPLES_HOLDING_HANDS = new CouplesHoldingHands();

    @ParameterizedTest
    @CsvSource({"'0,2,1,3',1", "'3,2,0,1',0"})
    void minSwapsCouples(@ConvertWith(CsvToArray.class) int[] row, int expect) {
        assertEquals(expect, COUPLES_HOLDING_HANDS.minSwapsCouples(row));
    }
}
