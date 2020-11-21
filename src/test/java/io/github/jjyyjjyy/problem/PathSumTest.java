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
class PathSumTest {

    private static final PathSum PATH_SUM = new PathSum();

    @ParameterizedTest
    @CsvSource({"'5,4,8,11,null,13,4,7,2,null,null,null,null,null,1',22,true"})
    void hasPathSum(@ConvertWith(CsvToTreeNode.class) TreeNode root, int sum, boolean expect) {
        assertEquals(expect, PATH_SUM.hasPathSum(root, sum));
    }
}
