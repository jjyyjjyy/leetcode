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
class BinaryTreeZigzagLevelOrderTraversalTest {

    private static final BinaryTreeZigzagLevelOrderTraversal BINARY_TREE_ZIGZAG_LEVEL_ORDER_TRAVERSAL = new BinaryTreeZigzagLevelOrderTraversal();

    @ParameterizedTest
    @CsvSource({"'3,9,20,null,null,15,7',3"})
    void zigzagLevelOrder(@ConvertWith(CsvToTreeNode.class) TreeNode root, int expect) {
        assertEquals(expect, BINARY_TREE_ZIGZAG_LEVEL_ORDER_TRAVERSAL.zigzagLevelOrder(root).size());
    }
}
