package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class FormLargestIntegerWithDigitsThatAddUpToTargetTest {

    private static final FormLargestIntegerWithDigitsThatAddUpToTarget FORM_LARGEST_INTEGER_WITH_DIGITS_THAT_ADD_UP_TO_TARGET = new FormLargestIntegerWithDigitsThatAddUpToTarget();

    @ParameterizedTest
    @CsvSource({"'4,3,2,5,6,7,2,5,5',9,7772", "'7,6,5,5,5,6,8,7,8',12,85", "'2,4,6,2,4,6,4,4,4',5,0", "'6,10,15,40,40,40,40,40,40',47,32211"})
    void largestNumber(@ConvertWith(CsvToArray.class) int[] cost, int target, String expect) {
        assertEquals(expect, FORM_LARGEST_INTEGER_WITH_DIGITS_THAT_ADD_UP_TO_TARGET.largestNumber(cost, target));
    }
}
