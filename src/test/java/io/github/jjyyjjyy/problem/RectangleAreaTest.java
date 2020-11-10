package io.github.jjyyjjyy.problem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class RectangleAreaTest {

    private static final RectangleArea RECTANGLE_AREA = new RectangleArea();

    @ParameterizedTest
    @CsvSource({"-3, 0, 3, 4, 0, -1, 9, 2, 45"})
    void computeArea(int a, int b, int c, int d, int e, int f, int g, int h, int expect) {
        assertEquals(expect, RECTANGLE_AREA.computeArea(a, b, c, d, e, f, g, h));
    }
}
