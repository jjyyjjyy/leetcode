package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class ChuanDiXinXiTest {

    private static final ChuanDiXinXi CHUAN_DI_XIN_XI = new ChuanDiXinXi();

    @ParameterizedTest
    @CsvSource({"5,'[0,2],[2,1],[3,4],[2,3],[1,4],[2,0],[0,4]',3,3", "3,'[0,2],[2,1]',2,0"})
    void numWays(int n, @ConvertWith(CsvToArray.class) int[][] relation, int k, int expect) {
        assertEquals(expect, CHUAN_DI_XIN_XI.numWays(n, relation, k));
    }
}
