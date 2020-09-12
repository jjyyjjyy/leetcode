package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.ListNode;
import io.github.jjyyjjyy.util.CsvToListNode;
import io.github.jjyyjjyy.util.ListNodeUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class ReverseLinkedListTest {

    private static final ReverseLinkedList REVERSE_LINKED_LIST = new ReverseLinkedList();

    @ParameterizedTest
    @CsvSource({"'1,2,3,4,5','5,4,3,2,1'"})
    void reverseList(@ConvertWith(CsvToListNode.class) ListNode head,
                     @ConvertWith(CsvToListNode.class) ListNode expect) {
        ListNode result = REVERSE_LINKED_LIST.reverseList(head);
        Assertions.assertTrue(ListNodeUtil.isSame(result, expect));
    }
}
