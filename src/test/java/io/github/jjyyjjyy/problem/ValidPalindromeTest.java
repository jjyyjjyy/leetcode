package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class ValidPalindromeTest {

    private static final ValidPalindrome VALID_PALINDROME = new ValidPalindrome();

    @ParameterizedTest
    @CsvSource({"'A man, a plan, a canal: Panama',true", "race a car,false"})
    void isPalindrome(String s, boolean expect) {
        assertEquals(expect, VALID_PALINDROME.isPalindrome(s));
    }
}
