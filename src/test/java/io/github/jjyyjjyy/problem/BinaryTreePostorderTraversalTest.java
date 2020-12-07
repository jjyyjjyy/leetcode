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
class BinaryTreePostorderTraversalTest {

    private static final BinaryTreePostorderTraversal BINARY_TREE_POSTORDER_TRAVERSAL = new BinaryTreePostorderTraversal();

    @ParameterizedTest
    @CsvSource({"'1,null,2,null,null,3','3,2,1'"})
    void postorderTraversal(@ConvertWith(CsvToTreeNode.class) TreeNode root,
                            @ConvertWith(CsvToArray.class) int[] expect) {
        assertArrayEquals(expect, ArrayUtil.toIntArray(BINARY_TREE_POSTORDER_TRAVERSAL.postorderTraversal(root)));
    }
}
