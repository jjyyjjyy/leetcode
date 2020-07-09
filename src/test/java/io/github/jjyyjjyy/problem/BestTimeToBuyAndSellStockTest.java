package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class BestTimeToBuyAndSellStockTest {

    private static final BestTimeToBuyAndSellStock BEST_TIME_TO_BUY_AND_SELL_STOCK = new BestTimeToBuyAndSellStock();

    @ParameterizedTest
    @CsvSource({"'7,1,5,3,6,4',5", "'7,6,4,3,1',0"})
    void maxProfit(@ConvertWith(CsvToArray.class) int[] arr, int expect) {
        assertEquals(expect, BEST_TIME_TO_BUY_AND_SELL_STOCK.maxProfit(arr));
    }
}
