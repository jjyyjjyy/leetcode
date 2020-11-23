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
class BinaryTreePathsTest {

    private static final BinaryTreePaths BINARY_TREE_PATHS = new BinaryTreePaths();

    @ParameterizedTest
    @CsvSource({"'1,2,3,null,5','1->2->5,1->3'"})
    void binaryTreePaths(@ConvertWith(CsvToTreeNode.class) TreeNode root, @ConvertWith(CsvToArray.class) String[] expect) {
        assertArrayEquals(BINARY_TREE_PATHS.binaryTreePaths(root).toArray(String[]::new), expect);
    }
}
