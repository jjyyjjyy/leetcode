package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class RegionsCutBySlashesTest {

    private static final RegionsCutBySlashes REGIONS_CUT_BY_SLASHES = new RegionsCutBySlashes();

    @ParameterizedTest
    @CsvSource({"' /,/ ', 2", "' /,  ',1", "'\\/,/\\',4", "'/\\,\\/',5", "'//,/ ',3"})
    void regionsBySlashes(@ConvertWith(CsvToArray.class) String[] grid, int expect) {
        assertEquals(expect, REGIONS_CUT_BY_SLASHES.regionsBySlashes(grid));
    }
}
