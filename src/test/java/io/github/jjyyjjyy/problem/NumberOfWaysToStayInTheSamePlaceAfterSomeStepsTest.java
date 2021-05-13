package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class NumberOfWaysToStayInTheSamePlaceAfterSomeStepsTest {

    private static final NumberOfWaysToStayInTheSamePlaceAfterSomeSteps NUMBER_OF_WAYS_TO_STAY_IN_THE_SAME_PLACE_AFTER_SOME_STEPS = new NumberOfWaysToStayInTheSamePlaceAfterSomeSteps();

    @ParameterizedTest
    @CsvSource({"3,2,4", "2,4,2", "4,2,8"})
    void numWays(int steps, int arrLen, int expect) {
        assertEquals(expect, NUMBER_OF_WAYS_TO_STAY_IN_THE_SAME_PLACE_AFTER_SOME_STEPS.numWays(steps, arrLen));
    }
}
