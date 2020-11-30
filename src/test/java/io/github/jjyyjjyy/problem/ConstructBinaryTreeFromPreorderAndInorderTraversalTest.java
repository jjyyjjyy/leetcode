package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.TreeNode;
import io.github.jjyyjjyy.util.CsvToArray;
import io.github.jjyyjjyy.util.CsvToTreeNode;
import io.github.jjyyjjyy.util.TreeNodeUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class ConstructBinaryTreeFromPreorderAndInorderTraversalTest {

    private static final ConstructBinaryTreeFromPreorderAndInorderTraversal CONSTRUCT_BINARY_TREE_FROM_PREORDER_AND_INORDER_TRAVERSAL = new ConstructBinaryTreeFromPreorderAndInorderTraversal();

    @ParameterizedTest
    @CsvSource({"'3,9,20,15,7','9,3,15,20,7','3,9,20,null,null,15,7'"})
    void buildTree(@ConvertWith(CsvToArray.class) int[] preorder,
                   @ConvertWith(CsvToArray.class) int[] inorder,
                   @ConvertWith(CsvToTreeNode.class) TreeNode expect) {
        Assertions.assertTrue(TreeNodeUtil.isSame(CONSTRUCT_BINARY_TREE_FROM_PREORDER_AND_INORDER_TRAVERSAL.buildTree(preorder, inorder), expect));
    }
}
