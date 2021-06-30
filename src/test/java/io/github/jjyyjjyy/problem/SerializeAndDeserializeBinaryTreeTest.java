package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.TreeNode;
import io.github.jjyyjjyy.util.CsvToTreeNode;
import io.github.jjyyjjyy.util.TreeNodeUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class SerializeAndDeserializeBinaryTreeTest {

    private static final SerializeAndDeserializeBinaryTree SERIALIZE_AND_DESERIALIZE_BINARY_TREE = new SerializeAndDeserializeBinaryTree();

    @ParameterizedTest
    @CsvSource({"'1,2,3,null,null,4,5'", "''", "'1'", "'1,2'"})
    void serialize(@ConvertWith(CsvToTreeNode.class) TreeNode root) {
        Assertions.assertTrue(TreeNodeUtil.isSame(SERIALIZE_AND_DESERIALIZE_BINARY_TREE.deserialize(SERIALIZE_AND_DESERIALIZE_BINARY_TREE.serialize(root)), root));
    }
}
