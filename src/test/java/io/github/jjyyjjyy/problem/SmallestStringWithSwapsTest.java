package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.ArrayUtil;
import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class SmallestStringWithSwapsTest {

    private static final SmallestStringWithSwaps SMALLEST_STRING_WITH_SWAPS = new SmallestStringWithSwaps();

    @ParameterizedTest
    @CsvSource({"dcab,'[0,3],[1,2]',bacd", "dcab,'[0,3],[1,2],[0,2]',abcd", "cba,'[0,1],[1,2]',abc"})
    void smallestStringWithSwaps(String s, @ConvertWith(CsvToArray.class) Integer[][] pairs, String expect) {
        assertEquals(expect, SMALLEST_STRING_WITH_SWAPS.smallestStringWithSwaps(s, ArrayUtil.toList(pairs)));
    }
}
