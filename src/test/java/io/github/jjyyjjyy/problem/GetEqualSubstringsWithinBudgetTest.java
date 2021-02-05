package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class GetEqualSubstringsWithinBudgetTest {

    private static final GetEqualSubstringsWithinBudget GET_EQUAL_SUBSTRINGS_WITHIN_BUDGET = new GetEqualSubstringsWithinBudget();

    @ParameterizedTest
    @CsvSource({"abcd,bcdf,3,3", "abcd,cdef,3,1", "abcd,acde,0,1"})
    void equalSubstring(String s, String t, int maxCost, int expect) {
        assertEquals(expect, GET_EQUAL_SUBSTRINGS_WITHIN_BUDGET.equalSubstring(s, t, maxCost));
    }
}
