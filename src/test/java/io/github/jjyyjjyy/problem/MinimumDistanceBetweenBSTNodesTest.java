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
class MinimumDistanceBetweenBSTNodesTest {

    private static final MinimumDistanceBetweenBSTNodes MINIMUM_DISTANCE_BETWEEN_BST_NODES = new MinimumDistanceBetweenBSTNodes();

    @ParameterizedTest
    @CsvSource({"'4,2,6,1,3',1", "'1,0,48,null,null,12,49',1", "'90,69,null,49,89,null,52',1"})
    void minDiffInBST(@ConvertWith(CsvToTreeNode.class) TreeNode root, int expect) {
        assertEquals(expect, MINIMUM_DISTANCE_BETWEEN_BST_NODES.minDiffInBST(root));
    }
}
