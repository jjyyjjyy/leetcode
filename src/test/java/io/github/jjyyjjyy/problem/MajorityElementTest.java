package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class MajorityElementTest {

    private static final MajorityElement MAJORITY_ELEMENT = new MajorityElement();

    @ParameterizedTest
    @CsvSource({"'3,2,3',3", "'2,2,1,1,1,2,2',2"})
    void majorityElement(@ConvertWith(CsvToArray.class) int[] arr, int expect) {
        assertEquals(expect, MAJORITY_ELEMENT.majorityElement(arr));
    }
}
