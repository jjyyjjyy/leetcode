package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.TreeNode;
import io.github.jjyyjjyy.util.CsvToArray;
import io.github.jjyyjjyy.util.CsvToTreeNode;
import io.github.jjyyjjyy.util.TreeNodeUtil;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author jy
 */
class ConstructBinaryTreeFromInorderAndPostorderTraversalTest {

    private static final ConstructBinaryTreeFromInorderAndPostorderTraversal CONSTRUCT_BINARY_TREE_FROM_INORDER_AND_POSTORDER_TRAVERSAL = new ConstructBinaryTreeFromInorderAndPostorderTraversal();

    @ParameterizedTest
    @CsvSource({"'9,3,15,20,7','9,15,7,20,3','3,9,20,null,null,15,7'"})
    void buildTree(@ConvertWith(CsvToArray.class) int[] inorder,
                   @ConvertWith(CsvToArray.class) int[] postorder,
                   @ConvertWith(CsvToTreeNode.class) TreeNode expect) {
        assertTrue(TreeNodeUtil.isSame(CONSTRUCT_BINARY_TREE_FROM_INORDER_AND_POSTORDER_TRAVERSAL.buildTree(inorder, postorder), expect));
    }
}
