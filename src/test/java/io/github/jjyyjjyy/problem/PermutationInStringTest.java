package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class PermutationInStringTest {

    private static final PermutationInString PERMUTATION_IN_STRING = new PermutationInString();

    @ParameterizedTest
    @CsvSource({"ab,eidbaooo,true", "ab,eidboaoo,false"})
    void checkInclusion(String s1, String s2, boolean expect) {
        assertEquals(expect, PERMUTATION_IN_STRING.checkInclusion(s1, s2));
    }
}
