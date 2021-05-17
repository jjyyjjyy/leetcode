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
class CousinsInBinaryTreeTest {

    private static final CousinsInBinaryTree COUSINS_IN_BINARY_TREE = new CousinsInBinaryTree();

    @ParameterizedTest
    @CsvSource({"'1,2,3,4',3,4,false", "'1,2,3,null,4,null,5',4,5,true", "'1,2,3',1,2,false"})
    void isCousins(@ConvertWith(CsvToTreeNode.class) TreeNode root, int x, int y, boolean expect) {
        assertEquals(expect, COUSINS_IN_BINARY_TREE.isCousins(root, x, y));
    }
}
