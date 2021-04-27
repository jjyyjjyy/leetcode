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
class RangeSumOfBSTTest {

    private static final RangeSumOfBST RANGE_SUM_OF_BST = new RangeSumOfBST();

    @ParameterizedTest
    @CsvSource({"'10,5,15,3,7,null,18',7,15,32", "'10,5,15,3,7,13,18,1,null,6',6,10,23"})
    void rangeSumBST(@ConvertWith(CsvToTreeNode.class) TreeNode root, int low, int high, int expect) {
        assertEquals(expect, RANGE_SUM_OF_BST.rangeSumBST(root, low, high));
    }
}
