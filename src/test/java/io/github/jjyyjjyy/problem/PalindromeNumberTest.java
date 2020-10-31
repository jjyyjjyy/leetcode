package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class PalindromeNumberTest {

    private static final PalindromeNumber PALINDROME_NUMBER = new PalindromeNumber();

    @ParameterizedTest
    @CsvSource({"121,true", "-121,false", "10,false"})
    void isPalindrome(int x, boolean expect) {
        assertEquals(expect, PALINDROME_NUMBER.isPalindrome(x));
    }
}
