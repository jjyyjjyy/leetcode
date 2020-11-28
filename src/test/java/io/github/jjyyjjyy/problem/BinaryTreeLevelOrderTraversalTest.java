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
class BinaryTreeLevelOrderTraversalTest {

    private static final BinaryTreeLevelOrderTraversal BINARY_TREE_LEVEL_ORDER_TRAVERSAL = new BinaryTreeLevelOrderTraversal();

    @ParameterizedTest
    @CsvSource({"'3,9,20,null,null,15,7',3"})
    void levelOrder(@ConvertWith(CsvToTreeNode.class) TreeNode root, int expect) {
        assertEquals(expect, BINARY_TREE_LEVEL_ORDER_TRAVERSAL.levelOrder(root).size());
    }
}
