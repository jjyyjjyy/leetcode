package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class BusRoutesTest {

    private static final BusRoutes BUS_ROUTES = new BusRoutes();

    @ParameterizedTest
    @CsvSource({"'[1,2,7],[3,6,7]',1,6,2", "'[7,12],[4,5,15],[6],[15,19],[9,12,13]',15,12,-1"})
    void numBusesToDestination(@ConvertWith(CsvToArray.class) int[][] routes, int source, int target, int expect) {
        assertEquals(expect, BUS_ROUTES.numBusesToDestination(routes, source, target));
    }
}
