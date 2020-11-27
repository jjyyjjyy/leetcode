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
class ValidateBinarySearchTreeTest {

    private static final ValidateBinarySearchTree VALIDATE_BINARY_SEARCH_TREE = new ValidateBinarySearchTree();

    @ParameterizedTest
    @CsvSource({"'2,1,3',true", "'5,1,4,null,null,3,6',false", "'1,1',false", "'10,5,15,null,null,6,20',false"})
    void isValidBST(@ConvertWith(CsvToTreeNode.class) TreeNode root, boolean expect) {
        assertEquals(expect, VALIDATE_BINARY_SEARCH_TREE.isValidBST(root));
    }
}
