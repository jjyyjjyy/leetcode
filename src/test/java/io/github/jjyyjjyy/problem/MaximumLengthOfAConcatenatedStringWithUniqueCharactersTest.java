package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

/**
 * @author jy
 */
class MaximumLengthOfAConcatenatedStringWithUniqueCharactersTest {

    private static final MaximumLengthOfAConcatenatedStringWithUniqueCharacters MAXIMUM_LENGTH_OF_A_CONCATENATED_STRING_WITH_UNIQUE_CHARACTERS = new MaximumLengthOfAConcatenatedStringWithUniqueCharacters();

    @ParameterizedTest
    @CsvSource({"'un,iq,ue',4", "'cha,r,act,ers',6", "'abcdefghijklmnopqrstuvwxyz',26"})
    void maxLength(@ConvertWith(CsvToArray.class) List<String> arr, int expect) {
        Assertions.assertEquals(expect, MAXIMUM_LENGTH_OF_A_CONCATENATED_STRING_WITH_UNIQUE_CHARACTERS.maxLength(arr));
    }
}
