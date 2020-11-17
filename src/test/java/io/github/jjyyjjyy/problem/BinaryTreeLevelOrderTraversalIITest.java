package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.TreeNode;
import io.github.jjyyjjyy.util.ArrayUtil;
import io.github.jjyyjjyy.util.CsvToArray;
import io.github.jjyyjjyy.util.CsvToTreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author jy
 */
class BinaryTreeLevelOrderTraversalIITest {

    private static final BinaryTreeLevelOrderTraversalII BINARY_TREE_LEVEL_ORDER_TRAVERSAL_II = new BinaryTreeLevelOrderTraversalII();

    @ParameterizedTest
    @CsvSource({"'3,9,20,null,null,15,7', '[15,7],[9,20],[3]'"})
    void levelOrderBottom(@ConvertWith(CsvToTreeNode.class) TreeNode root,
                          @ConvertWith(CsvToArray.class) Integer[][] expect) {
        assertTrue(ArrayUtil.isSame(ArrayUtil.toArray(BINARY_TREE_LEVEL_ORDER_TRAVERSAL_II.levelOrderBottom(root)), expect));
    }
}
