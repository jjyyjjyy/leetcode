package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class LongestCommonPrefixTest {

    private static final LongestCommonPrefix LONGEST_COMMON_PREFIX = new LongestCommonPrefix();

    @ParameterizedTest
    @CsvSource({"'flower,flow,flight',fl", "'dog,racecar,car',''"})
    void longestCommonPrefix(@ConvertWith(CsvToArray.class) String[] strs, String expect) {
        Assertions.assertEquals(expect, LONGEST_COMMON_PREFIX.longestCommonPrefix(strs));
    }
}
