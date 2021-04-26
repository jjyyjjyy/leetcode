package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class CapacityToShipPackagesWithInDDaysTest {

    private static final CapacityToShipPackagesWithInDDays CAPACITY_TO_SHIP_PACKAGES_WITH_IN_D_DAYS = new CapacityToShipPackagesWithInDDays();

    @ParameterizedTest
    @CsvSource({"'1,2,3,4,5,6,7,8,9,10',5,15", "'3,2,2,4,1,4',3,6", "'1,2,3,1,1',4,3"})
    void shipWithinDays(@ConvertWith(CsvToArray.class) int[] weights, int D, int expect) {
        assertEquals(expect, CAPACITY_TO_SHIP_PACKAGES_WITH_IN_D_DAYS.shipWithinDays(weights, D));
    }
}
