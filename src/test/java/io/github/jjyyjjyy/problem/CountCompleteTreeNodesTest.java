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
class CountCompleteTreeNodesTest {

    private static final CountCompleteTreeNodes COUNT_COMPLETE_TREE_NODES = new CountCompleteTreeNodes();

    @ParameterizedTest
    @CsvSource({"'1,2,3,4,5,6',6"})
    void countNodes(@ConvertWith(CsvToTreeNode.class) TreeNode root, int expect) {
        assertEquals(expect, COUNT_COMPLETE_TREE_NODES.countNodes(root));
    }
}
