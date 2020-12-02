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
class PathSumIITest {

    private static final PathSumII PATH_SUM_II = new PathSumII();

    @ParameterizedTest
    @CsvSource({"'5,4,8,11,null,13,4,7,2,null,null,null,null,5,1',22,'[5,4,11,2],[5,8,4,5]'"})
    void pathSum(@ConvertWith(CsvToTreeNode.class) TreeNode root,
                 int sum,
                 @ConvertWith(CsvToArray.class) Integer[][] expect) {
        assertTrue(ArrayUtil.isSame(ArrayUtil.toArray(PATH_SUM_II.pathSum(root, sum)), expect));
    }
}
