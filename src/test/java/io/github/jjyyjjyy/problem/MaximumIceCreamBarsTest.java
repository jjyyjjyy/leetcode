package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class MaximumIceCreamBarsTest {

    private static final MaximumIceCreamBars MAXIMUM_ICE_CREAM_BARS = new MaximumIceCreamBars();

    @ParameterizedTest
    @CsvSource({"'1,3,2,4,1',7,4", "'10,6,8,7,7,8',5,0", "'1,6,3,1,2,5',20,6"})
    void maxIceCream(@ConvertWith(CsvToArray.class) int[] costs, int coins, int expect) {
        assertEquals(expect, MAXIMUM_ICE_CREAM_BARS.maxIceCream2(costs, coins));
    }
}
