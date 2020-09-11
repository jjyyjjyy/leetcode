package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.ListNode;
import io.github.jjyyjjyy.util.CsvToListNode;
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
        while (true) {
            if (expect == null) {
                Assertions.assertNull(result);
                break;
            } else {
                Assertions.assertEquals(expect.val, result.val);
                expect = expect.next;
                result = result.next;
            }
        }
    }
}
