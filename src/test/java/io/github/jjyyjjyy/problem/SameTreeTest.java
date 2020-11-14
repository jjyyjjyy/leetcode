package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.TreeNode;
import io.github.jjyyjjyy.util.CsvToTreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class SameTreeTest {

    private static final SameTree SAME_TREE = new SameTree();

    @ParameterizedTest
    @CsvSource({"'1,2,3','1,2,3',true", "'1,2','1,,2',false", "'1,2,1','1,1,2',false"})
    void isSameTree(@ConvertWith(CsvToTreeNode.class) TreeNode p,
                    @ConvertWith(CsvToTreeNode.class) TreeNode q,
                    boolean expect) {
        Assertions.assertEquals(expect, SAME_TREE.isSameTree(p, q));
    }

}
