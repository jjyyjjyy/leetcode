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
class RotateListTest {

    private static final RotateList ROTATE_LIST = new RotateList();

    @ParameterizedTest
    @CsvSource({"'1,2,3,4,5',2,'4,5,1,2,3'", "'0,1,2',4,'2,0,1'", "'1,2,3,4,5',10,'1,2,3,4,5'"})
    void rotateRight(@ConvertWith(CsvToListNode.class) ListNode head, int k,
                     @ConvertWith(CsvToListNode.class) ListNode expect) {
        Assertions.assertTrue(ListNodeUtil.isSame(ROTATE_LIST.rotateRight(head, k), expect));
    }
}
