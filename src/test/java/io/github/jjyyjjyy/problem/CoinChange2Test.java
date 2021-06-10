package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class CoinChange2Test {

    private static final CoinChange2 COIN_CHANGE_2 = new CoinChange2();

    @ParameterizedTest
    @CsvSource({"5,'1,2,5',4", "3,'2',0", "10,'10',1"})
    void change(int amount, @ConvertWith(CsvToArray.class) int[] coins, int expect) {
        assertEquals(expect, COIN_CHANGE_2.change(amount, coins));
    }
}
