package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class CountTripletsThatCanFormTwoArraysOfEqualXorTest {

    private static final CountTripletsThatCanFormTwoArraysOfEqualXor COUNT_TRIPLETS_THAT_CAN_FORM_TWO_ARRAYS_OF_EQUAL_XOR = new CountTripletsThatCanFormTwoArraysOfEqualXor();

    @ParameterizedTest
    @CsvSource({"'2,3,1,6,7',4", "'1,1,1,1,1',10", "'2,3',0", "'1,3,5,7,9',3", "'7,11,12,9,5,2,7,17,22',8"})
    void countTriplets(@ConvertWith(CsvToArray.class) int[] arr, int expect) {
        assertEquals(expect, COUNT_TRIPLETS_THAT_CAN_FORM_TWO_ARRAYS_OF_EQUAL_XOR.countTriplets(arr));
    }
}
