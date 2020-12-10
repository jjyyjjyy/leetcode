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
class KthSmallestElementInABSTTest {

    private static final KthSmallestElementInABST KTH_SMALLEST_ELEMENT_IN_ABST = new KthSmallestElementInABST();

    @ParameterizedTest
    @CsvSource({"'3,1,4,null,2',1,1", "'5,3,6,2,4,null,null,1',3,3"})
    void kthSmallest(@ConvertWith(CsvToTreeNode.class) TreeNode root, int k, int expect) {
        assertEquals(expect, KTH_SMALLEST_ELEMENT_IN_ABST.kthSmallest(root, k));
    }
}
