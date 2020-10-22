package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author jy
 */
class LetterCombinationsOfAPhoneNumberTest {

    private static final LetterCombinationsOfAPhoneNumber LETTER_COMBINATIONS_OF_A_PHONE_NUMBER = new LetterCombinationsOfAPhoneNumber();

    @ParameterizedTest
    @CsvSource({"23,'ad,ae,af,bd,be,bf,cd,ce,cf'"})
    void letterCombinations(String digits, @ConvertWith(CsvToArray.class) String[] expect) {
        assertArrayEquals(expect, LETTER_COMBINATIONS_OF_A_PHONE_NUMBER.letterCombinations(digits).toArray(String[]::new));
    }
}
