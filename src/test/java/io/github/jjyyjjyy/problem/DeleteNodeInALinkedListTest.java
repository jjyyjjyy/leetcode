package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.ListNode;
import io.github.jjyyjjyy.util.CsvToListNode;
import io.github.jjyyjjyy.util.ListNodeUtil;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author jy
 */
class DeleteNodeInALinkedListTest {

    private static final DeleteNodeInALinkedList DELETE_NODE_IN_A_LINKED_LIST = new DeleteNodeInALinkedList();

    @ParameterizedTest
    @CsvSource({"'4,5,1,9',1,'4,1,9'", "'4,5,1,9',2,'4,5,9'"})
    void deleteNode(@ConvertWith(CsvToListNode.class) ListNode listNode,
                    int indexToDelete,
                    @ConvertWith(CsvToListNode.class) ListNode expect) {
        DELETE_NODE_IN_A_LINKED_LIST.deleteNode(ListNodeUtil.get(listNode, indexToDelete));
        assertTrue(ListNodeUtil.isSame(listNode, expect));
    }
}
