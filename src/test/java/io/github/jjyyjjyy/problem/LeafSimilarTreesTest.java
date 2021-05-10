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
class LeafSimilarTreesTest {

    private static final LeafSimilarTrees LEAF_SIMILAR_TREES = new LeafSimilarTrees();

    @ParameterizedTest
    @CsvSource({"'1,2,3','1,3,2',false", "'1,2','2,2',true", "'1','2',false", "'1','1',true"})
    void leafSimilar(@ConvertWith(CsvToTreeNode.class) TreeNode root1,
                     @ConvertWith(CsvToTreeNode.class) TreeNode root2,
                     boolean expect) {
        assertEquals(expect, LEAF_SIMILAR_TREES.leafSimilar(root1, root2));
    }
}
