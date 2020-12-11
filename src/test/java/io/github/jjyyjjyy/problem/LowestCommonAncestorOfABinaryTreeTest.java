package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.TreeNode;
import io.github.jjyyjjyy.util.CsvToTreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * @author jy
 */
class LowestCommonAncestorOfABinaryTreeTest {

    private static final LowestCommonAncestorOfABinaryTree LOWEST_COMMON_ANCESTOR_OF_A_BINARY_TREE = new LowestCommonAncestorOfABinaryTree();

    @ParameterizedTest
    @CsvSource({"'3,5,1,6,2,0,8,null,null,7,4','5','1',3"})
    void lowestCommonAncestor(@ConvertWith(CsvToTreeNode.class) TreeNode root,
                              @ConvertWith(CsvToTreeNode.class) TreeNode p,
                              @ConvertWith(CsvToTreeNode.class) TreeNode q,
                              Integer expect) {
        TreeNode result = LOWEST_COMMON_ANCESTOR_OF_A_BINARY_TREE.lowestCommonAncestor(root, p, q);
        if (expect == null) {
            assertNull(result);
        } else {
            assertEquals(expect, result.val);
        }

    }
}
