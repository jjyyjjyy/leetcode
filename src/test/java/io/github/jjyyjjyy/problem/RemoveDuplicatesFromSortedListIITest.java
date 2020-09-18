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
class RemoveDuplicatesFromSortedListIITest {

    private static final RemoveDuplicatesFromSortedListII REMOVE_DUPLICATES_FROM_SORTED_LIST_II = new RemoveDuplicatesFromSortedListII();

    @ParameterizedTest
    @CsvSource({"'1,2,3,3,4,4,5','1,2,5'", "'1,1,1,2,3','2,3'", "'1,1,1,1',''"})
    void deleteDuplicates(@ConvertWith(CsvToListNode.class) ListNode head,
                          @ConvertWith(CsvToListNode.class) ListNode expect) {
        Assertions.assertTrue(ListNodeUtil.isSame(REMOVE_DUPLICATES_FROM_SORTED_LIST_II.deleteDuplicates(head), expect));
    }
}
