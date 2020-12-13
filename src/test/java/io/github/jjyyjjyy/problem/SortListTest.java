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
class SortListTest {

    private static final SortList SORT_LIST = new SortList();

    @ParameterizedTest
    @CsvSource({"'4,2,1,3','1,2,3,4'", "'-1,5,3,4,0','-1,0,3,4,5'", "'3,2,1','1,2,3'"})
    void sortList(@ConvertWith(CsvToListNode.class) ListNode head,
                  @ConvertWith(CsvToListNode.class) ListNode expect) {
        assertTrue(ListNodeUtil.isSame(SORT_LIST.sortList(head), expect));
    }
}
