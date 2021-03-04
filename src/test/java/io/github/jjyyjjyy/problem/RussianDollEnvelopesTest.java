package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class RussianDollEnvelopesTest {

    private static final RussianDollEnvelopes RUSSIAN_DOLL_ENVELOPES = new RussianDollEnvelopes();

    @ParameterizedTest
    @CsvSource({"'[5,4],[6,4],[6,7],[2,3]',3", "'[1,1],[1,1],[1,1]',1", "'[4,5],[4,6],[6,7],[2,3],[1,1]',4", "'[30,50],[12,2],[3,4],[12,15]',3"})
    void maxEnvelopes(@ConvertWith(CsvToArray.class) int[][] envelopes, int expect) {
        assertEquals(expect, RUSSIAN_DOLL_ENVELOPES.maxEnvelopes(envelopes));
    }
}
