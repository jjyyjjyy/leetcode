package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class PalindromePartitioningIITest {

    private static final PalindromePartitioningII PALINDROME_PARTITIONING_II = new PalindromePartitioningII();

    @ParameterizedTest
    @CsvSource({"aab,1", "a,0", "ab,1"})
    void minCut(String s, int expect) {
        assertEquals(expect, PALINDROME_PARTITIONING_II.minCut(s));
    }
}
