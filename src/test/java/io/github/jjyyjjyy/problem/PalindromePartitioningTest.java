package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.ArrayUtil;
import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author jy
 */
class PalindromePartitioningTest {

    private static final PalindromePartitioning PALINDROME_PARTITIONING = new PalindromePartitioning();

    @ParameterizedTest
    @CsvSource({"aab,'[a,a,b],[aa,b]'", "a,'[a]'"})
    void partition(String s, @ConvertWith(CsvToArray.class) String[][] expect) {
        assertTrue(ArrayUtil.isSame(expect, ArrayUtil.toArray(PALINDROME_PARTITIONING.partition(s))));
    }
}
