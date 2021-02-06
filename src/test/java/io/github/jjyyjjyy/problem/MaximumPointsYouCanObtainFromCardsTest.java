package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class MaximumPointsYouCanObtainFromCardsTest {

    private static final MaximumPointsYouCanObtainFromCards MAXIMUM_POINTS_YOU_CAN_OBTAIN_FROM_CARDS = new MaximumPointsYouCanObtainFromCards();

    @ParameterizedTest
    @CsvSource({"'1,2,3,4,5,6,1',3,12", "'2,2,2',2,4", "'9,7,7,9,7,7,9',7,55", "'1,1000,1',1,1", "'1,79,80,1,1,1,200,1',3,202"})
    void maxScore(@ConvertWith(CsvToArray.class) int[] cardPoints, int k, int expect) {
        assertEquals(expect, MAXIMUM_POINTS_YOU_CAN_OBTAIN_FROM_CARDS.maxScore(cardPoints, k));
    }
}
