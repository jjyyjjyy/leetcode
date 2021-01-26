package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class NumberOfEquivalentDominoPairsTest {

    private static final NumberOfEquivalentDominoPairs NUMBER_OF_EQUIVALENT_DOMINO_PAIRS = new NumberOfEquivalentDominoPairs();

    @ParameterizedTest
    @CsvSource({"'[1,2],[2,1],[3,4],[5,6]',1"})
    void numEquivDominoPairs(@ConvertWith(CsvToArray.class) int[][] dominoes, int expect) {
        assertEquals(expect, NUMBER_OF_EQUIVALENT_DOMINO_PAIRS.numEquivDominoPairs(dominoes));
    }
}
