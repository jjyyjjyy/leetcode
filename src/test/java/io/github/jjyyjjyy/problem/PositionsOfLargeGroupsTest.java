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
class PositionsOfLargeGroupsTest {

    private static final PositionsOfLargeGroups POSITIONS_OF_LARGE_GROUPS = new PositionsOfLargeGroups();

    @ParameterizedTest
    @CsvSource({"abbxxxxzzy,'[3,6]'", "abc,''", "abcdddeeeeaabbbcd,'[3,5],[6,9],[12,14]'", "aba,''", "avccc,'[2,4]'"})
    void largeGroupPositions(String s, @ConvertWith(CsvToArray.class) Integer[][] expect) {
        assertTrue(ArrayUtil.isSame(ArrayUtil.toArray(POSITIONS_OF_LARGE_GROUPS.largeGroupPositions(s)), expect));
    }
}
