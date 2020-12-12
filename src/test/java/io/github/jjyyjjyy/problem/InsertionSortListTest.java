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
class InsertionSortListTest {

    private static final InsertionSortList INSERTION_SORT_LIST = new InsertionSortList();

    @ParameterizedTest
    @CsvSource({"'4,2,1,3','1,2,3,4'", "'-1,5,3,4,0','-1,0,3,4,5'"})
    void insertionSortList(@ConvertWith(CsvToListNode.class) ListNode head,
                           @ConvertWith(CsvToListNode.class) ListNode expect) {
        assertTrue(ListNodeUtil.isSame(INSERTION_SORT_LIST.insertionSortList(head), expect));
    }
}
