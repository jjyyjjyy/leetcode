package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.TreeNode;
import io.github.jjyyjjyy.util.CsvToTreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * @author jy
 */
class FlattenBinaryTreeToLinkedListTest {

    private static final FlattenBinaryTreeToLinkedList FLATTEN_BINARY_TREE_TO_LINKED_LIST = new FlattenBinaryTreeToLinkedList();

    @ParameterizedTest
    @CsvSource({"'1,2,5,3,4,null,6'"})
    void flatten(@ConvertWith(CsvToTreeNode.class) TreeNode root) {
        FLATTEN_BINARY_TREE_TO_LINKED_LIST.flatten(root);
        while (root != null) {
            assertNull(root.left);
            root = root.right;
        }
    }
}
