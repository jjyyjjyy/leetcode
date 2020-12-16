package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class HIndexTest {

    private static final HIndex H_INDEX = new HIndex();

    @ParameterizedTest
    @CsvSource({"'3,0,6,1,5',3"})
    void hIndex(@ConvertWith(CsvToArray.class) int[] citations, int expect) {
        assertEquals(expect, H_INDEX.hIndex2(citations));
    }
}
