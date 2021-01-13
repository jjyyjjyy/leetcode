package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author jy
 */
class RedundantConnectionTest {

    private static final RedundantConnection REDUNDANT_CONNECTION = new RedundantConnection();

    @ParameterizedTest
    @CsvSource({"'[1,2],[1,3],[2,3]','2,3'", "'[1,2],[2,3],[3,4],[1,4],[1,5]','1,4'"})
    void findRedundantConnection(@ConvertWith(CsvToArray.class) int[][] edges, @ConvertWith(CsvToArray.class) int[] expect) {
        assertArrayEquals(expect, REDUNDANT_CONNECTION.findRedundantConnection(edges));
    }
}
