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
class RemoveNthNodeFromEndOfListTest {

    private static final RemoveNthNodeFromEndOfList REMOVE_NTH_NODE_FROM_END_OF_LIST = new RemoveNthNodeFromEndOfList();

    @ParameterizedTest
    @CsvSource({"'1,2,3,4,5',2,'1,2,3,5'", "'1',1,''", "'1,2',1,'1'"})
    void removeNthFromEnd(@ConvertWith(CsvToListNode.class) ListNode head, int n,
                          @ConvertWith(CsvToListNode.class) ListNode expect) {
        assertTrue(ListNodeUtil.isSame(REMOVE_NTH_NODE_FROM_END_OF_LIST.removeNthFromEnd(head, n), expect));
    }
}
