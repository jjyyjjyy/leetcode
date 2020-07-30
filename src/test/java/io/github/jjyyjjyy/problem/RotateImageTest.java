package io.github.jjyyjjyy.problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author jy
 */
class RotateImageTest {

    private static final RotateImage ROTATE_IMAGE = new RotateImage();

    @Test
    void rotate() {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        ROTATE_IMAGE.rotate(arr);
        Assertions.assertArrayEquals(new int[]{7, 4, 1}, arr[0]);
        Assertions.assertArrayEquals(new int[]{8, 5, 2}, arr[1]);
        Assertions.assertArrayEquals(new int[]{9, 6, 3}, arr[2]);
    }
}
