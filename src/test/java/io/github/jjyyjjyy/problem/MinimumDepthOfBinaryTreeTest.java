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
class MinimumDepthOfBinaryTreeTest {

    private static final MinimumDepthOfBinaryTree MINIMUM_DEPTH_OF_BINARY_TREE = new MinimumDepthOfBinaryTree();

    @ParameterizedTest
    @CsvSource({"'3,9,20,null,null,15,7',2", "'2,null,3,null,null,null,4,null,null,null,null,null,null,null,5',4"})
    void minDepth(@ConvertWith(CsvToTreeNode.class) TreeNode root, int expect) {
        assertEquals(expect, MINIMUM_DEPTH_OF_BINARY_TREE.minDepth(root));
    }
}
