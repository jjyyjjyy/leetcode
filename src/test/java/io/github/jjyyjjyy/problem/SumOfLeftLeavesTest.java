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
class SumOfLeftLeavesTest {

    private static final SumOfLeftLeaves SUM_OF_LEFT_LEAVES = new SumOfLeftLeaves();

    @ParameterizedTest
    @CsvSource({"'3,9,20,null,null,15,7',24"})
    void sumOfLeftLeaves(@ConvertWith(CsvToTreeNode.class) TreeNode root, int expect) {
        assertEquals(expect, SUM_OF_LEFT_LEAVES.sumOfLeftLeaves(root));
    }
}
