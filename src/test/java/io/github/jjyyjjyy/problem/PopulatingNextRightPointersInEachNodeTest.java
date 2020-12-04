package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.TreeNode;
import io.github.jjyyjjyy.util.CsvToTreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author jy
 */
class PopulatingNextRightPointersInEachNodeTest {

    private static final PopulatingNextRightPointersInEachNode POPULATING_NEXT_RIGHT_POINTERS_IN_EACH_NODE = new PopulatingNextRightPointersInEachNode();

    @ParameterizedTest
    @CsvSource({"'1,2,3,4,5,6,7'"})
    void connect(@ConvertWith(CsvToTreeNode.class) TreeNode root) {
        POPULATING_NEXT_RIGHT_POINTERS_IN_EACH_NODE.connect(root);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                if (current == null) {
                    break;
                }
                if (i < size - 1) {
                    Assertions.assertNotNull(current.next);
                }
                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
        }
    }
}
