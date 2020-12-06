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
class SumRootToLeafNumbersTest {

    private static final SumRootToLeafNumbers SUM_ROOT_TO_LEAF_NUMBERS = new SumRootToLeafNumbers();

    @ParameterizedTest
    @CsvSource({"'1,2,3',25", "'4,9,0,5,1',1026"})
    void sumNumbers(@ConvertWith(CsvToTreeNode.class) TreeNode root, int expect) {
        assertEquals(expect, SUM_ROOT_TO_LEAF_NUMBERS.sumNumbers(root));
    }
}
