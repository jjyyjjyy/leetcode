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
class ReverseLinkedListIITest {

    private static final ReverseLinkedListII REVERSE_LINKED_LIST_II = new ReverseLinkedListII();

    @ParameterizedTest
    @CsvSource({"'1,2,3,4,5',2,4,'1,4,3,2,5'", "'3,5',1,2,'5,3'"})
    void reverseBetween(@ConvertWith(CsvToListNode.class) ListNode head, int m, int n,
                        @ConvertWith(CsvToListNode.class) ListNode except) {
        Assertions.assertTrue(ListNodeUtil.isSame(REVERSE_LINKED_LIST_II.reverseBetween(head, m, n), except));
    }
}
