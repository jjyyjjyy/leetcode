package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.ArrayUtil;
import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author jy
 */
class FlippingAnImageTest {

    private static final FlippingAnImage FLIPPING_AN_IMAGE = new FlippingAnImage();

    @ParameterizedTest
    @CsvSource({"'[1,1,0],[1,0,1],[0,0,0]','[1,0,0],[0,1,0],[1,1,1]'", "'[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]','[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]'"})
    void flipAndInvertImage(@ConvertWith(CsvToArray.class) int[][] A,
                            @ConvertWith(CsvToArray.class) int[][] expect) {
        assertTrue(ArrayUtil.isSame(expect, FLIPPING_AN_IMAGE.flipAndInvertImage(A)));
    }
}
