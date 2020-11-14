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
class SymmetricTreeTest {

    private static final SymmetricTree SYMMETRIC_TREE = new SymmetricTree();

    @ParameterizedTest
    @CsvSource({"'1,2,2,3,4,4,3',true", "'1,2,2,null,3,null,3',false"})
    void isSymmetric(@ConvertWith(CsvToTreeNode.class) TreeNode root, boolean expect) {
        assertEquals(expect, SYMMETRIC_TREE.isSymmetric(root));
    }
}
