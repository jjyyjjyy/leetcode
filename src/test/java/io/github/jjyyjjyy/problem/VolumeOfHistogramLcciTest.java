package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class VolumeOfHistogramLcciTest {

    private static final VolumeOfHistogramLcci VOLUME_OF_HISTOGRAM_LCCI = new VolumeOfHistogramLcci();

    @ParameterizedTest
    @CsvSource({"'0,1,0,2,1,0,1,3,2,1,2,1',6"})
    void trap(@ConvertWith(CsvToArray.class) int[] height, int expect) {
        assertEquals(expect, VOLUME_OF_HISTOGRAM_LCCI.trap(height));
    }
}
