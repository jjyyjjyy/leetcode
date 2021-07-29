package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.util.ArrayUtil;
import io.github.jjyyjjyy.util.CsvToArray;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author jy
 */
class PathInZigzagLabelledBinaryTreeTest {

    private static final PathInZigzagLabelledBinaryTree PATH_IN_ZIGZAG_LABELLED_BINARY_TREE = new PathInZigzagLabelledBinaryTree();

    @ParameterizedTest
    @CsvSource({"14,'1,3,4,14'", "26,'1,2,6,10,26'"})
    void pathInZigZagTree(int label, @ConvertWith(CsvToArray.class) int[] expect) {
        assertArrayEquals(expect, ArrayUtil.toIntArray(PATH_IN_ZIGZAG_LABELLED_BINARY_TREE.pathInZigZagTree(label)));
    }
}
