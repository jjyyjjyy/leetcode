package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Node;
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
class PopulatingNextRightPointersInEachNodeIITest {

    private static final PopulatingNextRightPointersInEachNodeII POPULATING_NEXT_RIGHT_POINTERS_IN_EACH_NODE_II = new PopulatingNextRightPointersInEachNodeII();

    @ParameterizedTest
    @CsvSource({"'1,2,3,4,5,null,7'"})
    void connect(@ConvertWith(CsvToTreeNode.class) Node root) {
        POPULATING_NEXT_RIGHT_POINTERS_IN_EACH_NODE_II.connect(root);
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node current = queue.poll();
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
