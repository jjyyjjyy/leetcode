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
class RemoveLinkedListElementsTest {

    private static final RemoveLinkedListElements REMOVE_LINKED_LIST_ELEMENTS = new RemoveLinkedListElements();

    @ParameterizedTest
    @CsvSource({"'1,2,6,3,4,5,6',6,'1,2,3,4,5'", "'1,2,2,1',2,'1,1'"})
    void removeElements(@ConvertWith(CsvToListNode.class) ListNode listNode, int val,
                        @ConvertWith(CsvToListNode.class) ListNode expect) {
        ListNode result = REMOVE_LINKED_LIST_ELEMENTS.removeElements(listNode, val);
        Assertions.assertTrue(ListNodeUtil.isSame(result, expect));
    }
}
