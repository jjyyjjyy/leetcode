package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.ArrayUtil;
import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class GroupAnagramsTest {

    private static final GroupAnagrams GROUP_ANAGRAMS = new GroupAnagrams();

    @ParameterizedTest
    @CsvSource({"'eat,tea,tan,ate,nat,bat','[eat,tea,ate],[bat],[tan,nat]'"})
    void groupAnagrams(@ConvertWith(CsvToArray.class) String[] strs,
                       @ConvertWith(CsvToArray.class) String[][] expect) {
        Assertions.assertTrue(ArrayUtil.isSame(GROUP_ANAGRAMS.groupAnagrams(strs).stream().map(list -> list.toArray(String[]::new)).toArray(String[][]::new), expect));
    }
}
