package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.TreeNode;
import io.github.jjyyjjyy.util.CsvToTreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class LowestCommonAncestorOfABinarySearchTreeTest {

    private static final LowestCommonAncestorOfABinarySearchTree LOWEST_COMMON_ANCESTOR_OF_A_BINARY_SEARCH_TREE = new LowestCommonAncestorOfABinarySearchTree();

    @ParameterizedTest
    @CsvSource({"'6,2,8,0,4,7,9,null,null,3,5','2','8','6'", "'6,2,8,0,4,7,9,null,null,3,5','2','4','2'"})
    void lowestCommonAncestor(@ConvertWith(CsvToTreeNode.class) TreeNode root,
                              @ConvertWith(CsvToTreeNode.class) TreeNode p,
                              @ConvertWith(CsvToTreeNode.class) TreeNode q,
                              @ConvertWith(CsvToTreeNode.class) TreeNode expect) {
        assertEquals(expect.val, LOWEST_COMMON_ANCESTOR_OF_A_BINARY_SEARCH_TREE.lowestCommonAncestor(root, p, q).val);
    }
}
