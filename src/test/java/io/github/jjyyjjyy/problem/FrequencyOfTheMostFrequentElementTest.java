package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class FrequencyOfTheMostFrequentElementTest {

    private static final FrequencyOfTheMostFrequentElement FREQUENCY_OF_THE_MOST_FREQUENT_ELEMENT = new FrequencyOfTheMostFrequentElement();

    @ParameterizedTest
    @CsvSource({"'1,2,4',5,3", "'1,4,8,13',5,2"})
    void maxFrequency(@ConvertWith(CsvToArray.class) int[] nums, int k, int expect) {
        assertEquals(expect, FREQUENCY_OF_THE_MOST_FREQUENT_ELEMENT.maxFrequency(nums, k));
    }
}
