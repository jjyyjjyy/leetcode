package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class CountGoodMealsTest {

    private static final CountGoodMeals COUNT_GOOD_MEALS = new CountGoodMeals();

    @ParameterizedTest
    @CsvSource({"'1,3,5,7,9',4", "'1,1,1,3,3,3,7',15"})
    void countPairs(@ConvertWith(CsvToArray.class) int[] deliciousness, int expect) {
        assertEquals(expect, COUNT_GOOD_MEALS.countPairs(deliciousness));
    }
}
