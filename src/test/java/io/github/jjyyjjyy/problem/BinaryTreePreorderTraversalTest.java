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
class BinaryTreePreorderTraversalTest {

    private static final BinaryTreePreorderTraversal BINARY_TREE_PREORDER_TRAVERSAL = new BinaryTreePreorderTraversal();

    @ParameterizedTest
    @CsvSource({"'1,null,2,null,null,3','1,2,3'", "'1,null,2','1,2'"})
    void preorderTraversal(@ConvertWith(CsvToTreeNode.class) TreeNode root,
                           @ConvertWith(CsvToArray.class) int[] expect) {
        assertArrayEquals(expect, ArrayUtil.toIntArray(BINARY_TREE_PREORDER_TRAVERSAL.preorderTraversal(root)));
    }
}
