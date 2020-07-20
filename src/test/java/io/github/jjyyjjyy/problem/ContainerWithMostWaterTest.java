package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class ContainerWithMostWaterTest {

    private static final ContainerWithMostWater CONTAINER_WITH_MOST_WATER = new ContainerWithMostWater();

    @ParameterizedTest
    @CsvSource({"'1,8,6,2,5,4,8,3,7', 49"})
    void maxArea(@ConvertWith(CsvToArray.class) int[] arr, int expect) {
        assertEquals(expect, CONTAINER_WITH_MOST_WATER.maxArea(arr));
    }
}
