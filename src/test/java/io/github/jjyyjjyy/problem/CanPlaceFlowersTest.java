package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class CanPlaceFlowersTest {

    private static final CanPlaceFlowers CAN_PLACE_FLOWERS = new CanPlaceFlowers();

    @ParameterizedTest
    @CsvSource({"'1,0,0,0,1',1,true", "'1,0,0,0,1',2,false", "'0,0,1,0,1',1,true", "'1,0,0,0,1,0,0',2,true", "'0',1,true", "'0,0,1,0,0',1,true"})
    void canPlaceFlowers(@ConvertWith(CsvToArray.class) int[] flowerbed, int n, boolean expect) {
        assertEquals(expect, CAN_PLACE_FLOWERS.canPlaceFlowers(flowerbed, n));
    }
}
