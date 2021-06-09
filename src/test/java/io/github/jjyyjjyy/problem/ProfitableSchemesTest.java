package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class ProfitableSchemesTest {

    private static final ProfitableSchemes PROFITABLE_SCHEMES = new ProfitableSchemes();

    @ParameterizedTest
    @CsvSource({"5,3,'2,2','2,3',2", "10,5,'2,3,5','6,7,8',7"})
    void profitableSchemes(int n, int minProfit,
                           @ConvertWith(CsvToArray.class) int[] group,
                           @ConvertWith(CsvToArray.class) int[] profit,
                           int expect) {
        assertEquals(expect, PROFITABLE_SCHEMES.profitableSchemes(n, minProfit, group, profit));
    }
}
