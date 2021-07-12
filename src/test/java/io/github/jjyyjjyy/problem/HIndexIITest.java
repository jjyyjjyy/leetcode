package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class HIndexIITest {

    private static final HIndexII H_INDEX_II = new HIndexII();

    @ParameterizedTest
    @CsvSource({"'0,1,3,5,6',3"})
    void hIndex(@ConvertWith(CsvToArray.class) int[] citations, int expect) {
        assertEquals(expect, H_INDEX_II.hIndex(citations));
    }
}
