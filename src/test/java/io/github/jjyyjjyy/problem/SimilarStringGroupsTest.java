package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class SimilarStringGroupsTest {

    private static final SimilarStringGroups SIMILAR_STRING_GROUPS = new SimilarStringGroups();

    @ParameterizedTest
    @CsvSource({"'tars,rats,arts,star',2", "'omv,ovm',1"})
    void numSimilarGroups(@ConvertWith(CsvToArray.class) String[] strs, int expect) {
        assertEquals(expect, SIMILAR_STRING_GROUPS.numSimilarGroups(strs));
    }
}
