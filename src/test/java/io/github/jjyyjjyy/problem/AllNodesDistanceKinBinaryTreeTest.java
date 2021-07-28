package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.TreeNode;
import io.github.jjyyjjyy.util.CsvToArray;
import io.github.jjyyjjyy.util.CsvToTreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author jy
 */
class AllNodesDistanceKinBinaryTreeTest {

    @ParameterizedTest
    @CsvSource({"'3,5,1,6,2,0,8,null,null,7,4','5',2,'7,4,1'"})
    void distanceK(@ConvertWith(CsvToTreeNode.class) TreeNode root, int k, @ConvertWith(CsvToArray.class) Integer[] expect) {
        assertArrayEquals(expect, new AllNodesDistanceKinBinaryTree().distanceK(root, root.left, k).toArray(new Integer[0]));
    }
}
