package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class RemoveAllAdjacentDuplicatesInStringTest {

    private static final RemoveAllAdjacentDuplicatesInString REMOVE_ALL_ADJACENT_DUPLICATES_IN_STRING = new RemoveAllAdjacentDuplicatesInString();

    @ParameterizedTest
    @CsvSource({"abbaca,ca"})
    void removeDuplicates(String S, String expect) {
        assertEquals(expect, REMOVE_ALL_ADJACENT_DUPLICATES_IN_STRING.removeDuplicates(S));
    }
}
