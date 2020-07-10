package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class BestTimeToBuyAndSellStockIITest {

    private static final BestTimeToBuyAndSellStockII BEST_TIME_TO_BUY_AND_SELL_STOCK_II = new BestTimeToBuyAndSellStockII();

    @ParameterizedTest
    @CsvSource({"'7,1,5,3,6,4',7", "'1,2,3,4,5,6',5", "'6,5,4,3,2,1',0"})
    void maxProfit(@ConvertWith(CsvToArray.class) int[] arr, int expect) {
        Assertions.assertEquals(expect, BEST_TIME_TO_BUY_AND_SELL_STOCK_II.maxProfit(arr));
    }
}
