package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class MinimumNumberOfDaysToMakeMBouquetsTest {

    private static final MinimumNumberOfDaysToMakeMBouquets MINIMUM_NUMBER_OF_DAYS_TO_MAKE_M_BOUQUETS = new MinimumNumberOfDaysToMakeMBouquets();

    @ParameterizedTest
    @CsvSource({"'1,10,3,10,2',3,1,3", "'1,10,3,10,2',3,2,-1", "'7,7,7,7,12,7,7',2,3,12", "'1000000000,1000000000',1,1,1000000000", "'1,10,2,9,3,8,4,7,5,6',4,2,9"})
    void minDays(@ConvertWith(CsvToArray.class) int[] bloomDay, int m, int k, int expect) {
        assertEquals(expect, MINIMUM_NUMBER_OF_DAYS_TO_MAKE_M_BOUQUETS.minDays(bloomDay, m, k));
    }
}
