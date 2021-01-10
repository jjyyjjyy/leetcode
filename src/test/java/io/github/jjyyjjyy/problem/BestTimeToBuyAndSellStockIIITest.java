package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class BestTimeToBuyAndSellStockIIITest {

    private static final BestTimeToBuyAndSellStockIII BEST_TIME_TO_BUY_AND_SELL_STOCK_III = new BestTimeToBuyAndSellStockIII();

    @ParameterizedTest
    @CsvSource({"'3,3,5,0,0,3,1,4',6", "'1,2,3,4,5',4", "'7,6,4,3,1',0"})
    void maxProfit(@ConvertWith(CsvToArray.class) int[] prices, int expect) {
        assertEquals(expect, BEST_TIME_TO_BUY_AND_SELL_STOCK_III.maxProfit(prices));
    }
}
