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
class IncreasingOrderSearchTreeTest {

    private static final IncreasingOrderSearchTree INCREASING_ORDER_SEARCH_TREE = new IncreasingOrderSearchTree();

    @ParameterizedTest
    @CsvSource({"'5,1,7','1,null,5,null,null,null,7'"})
    void increasingBST(@ConvertWith(CsvToTreeNode.class) TreeNode root,
                       @ConvertWith(CsvToTreeNode.class) TreeNode expect) {
        assertTrue(TreeNodeUtil.isSame(INCREASING_ORDER_SEARCH_TREE.increasingBST(root), expect));
    }
}
