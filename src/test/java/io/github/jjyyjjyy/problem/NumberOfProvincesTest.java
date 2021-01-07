package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class NumberOfProvincesTest {

    private static final NumberOfProvinces NUMBER_OF_PROVINCES = new NumberOfProvinces();

    @ParameterizedTest
    @CsvSource({"'[1,1,0],[1,1,0],[0,0,1]',2", "'[1,0,0],[0,1,0],[0,0,1]',3"})
    void findCircleNum(@ConvertWith(CsvToArray.class) int[][] isConnected, int expect) {
        assertEquals(expect, NUMBER_OF_PROVINCES.findCircleNum(isConnected));
    }
}
