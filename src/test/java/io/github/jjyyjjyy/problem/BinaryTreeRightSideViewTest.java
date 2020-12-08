package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.TreeNode;
import io.github.jjyyjjyy.util.ArrayUtil;
import io.github.jjyyjjyy.util.CsvToArray;
import io.github.jjyyjjyy.util.CsvToTreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author jy
 */
class BinaryTreeRightSideViewTest {

    private static final BinaryTreeRightSideView BINARY_TREE_RIGHT_SIDE_VIEW = new BinaryTreeRightSideView();

    @ParameterizedTest
    @CsvSource({"'1,2,3,null,5,null,4','1,3,4'", "'1,2','1,2'", "'1,2,3,4','1,3,4'"})
    void rightSideView(@ConvertWith(CsvToTreeNode.class) TreeNode root,
                       @ConvertWith(CsvToArray.class) int[] expect) {
        assertArrayEquals(expect, ArrayUtil.toIntArray(BINARY_TREE_RIGHT_SIDE_VIEW.rightSideView(root)));
    }
}
