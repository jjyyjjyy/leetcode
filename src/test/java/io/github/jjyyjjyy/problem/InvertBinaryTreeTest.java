package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.TreeNode;
import io.github.jjyyjjyy.util.CsvToTreeNode;
import io.github.jjyyjjyy.util.TreeNodeUtil;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author jy
 */
class InvertBinaryTreeTest {

    private static final InvertBinaryTree INVERT_BINARY_TREE = new InvertBinaryTree();

    @ParameterizedTest
    @CsvSource({"'4,2,7,1,3,6,9','4,7,2,9,6,3,1'"})
    void invertTree(@ConvertWith(CsvToTreeNode.class) TreeNode root,
                    @ConvertWith(CsvToTreeNode.class) TreeNode expect) {
        assertTrue(TreeNodeUtil.isSame(INVERT_BINARY_TREE.invertTree(root), expect));
    }
}
