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
class ConvertSortedArrayToBinarySearchTreeTest {

    private static final ConvertSortedArrayToBinarySearchTree CONVERT_SORTED_ARRAY_TO_BINARY_SEARCH_TREE = new ConvertSortedArrayToBinarySearchTree();

    @ParameterizedTest
    @CsvSource({"'-10,-3,0,5,9','0,-10,5,null,-3,null,9'"})
    void sortedArrayToBST(@ConvertWith(CsvToArray.class) int[] nums,
                          @ConvertWith(CsvToTreeNode.class) TreeNode expect) {
        assertTrue(TreeNodeUtil.isSame(CONVERT_SORTED_ARRAY_TO_BINARY_SEARCH_TREE.sortedArrayToBST(nums), expect));
    }
}
