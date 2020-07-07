package io.github.jjyyjjyy.problem;

import org.junit.jupiter.api.Test;

import java.util.List;

import static io.github.jjyyjjyy.util.ArrayUtil.toIntArray;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class PascalsTriangleTest {

    private static final PascalsTriangle pascalsTriangle = new PascalsTriangle();

    @Test
    void generate() {
        List<List<Integer>> generate0 = pascalsTriangle.generate(0);
        assertEquals(0, generate0.size());
        List<List<Integer>> generate1 = pascalsTriangle.generate(1);
        assertEquals(1, generate1.size());
        assertArrayEquals(new int[]{1}, toIntArray(generate1.get(0)));
        List<List<Integer>> generate5 = pascalsTriangle.generate(5);
        assertEquals(5, generate5.size());
        assertArrayEquals(new int[]{1}, toIntArray(generate5.get(0)));
        assertArrayEquals(new int[]{1, 1}, toIntArray(generate5.get(1)));
        assertArrayEquals(new int[]{1, 2, 1}, toIntArray(generate5.get(2)));
        assertArrayEquals(new int[]{1, 3, 3, 1}, toIntArray(generate5.get(3)));
        assertArrayEquals(new int[]{1, 4, 6, 4, 1}, toIntArray(generate5.get(4)));
    }

}
