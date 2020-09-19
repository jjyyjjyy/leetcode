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
class PartitionListTest {

    private static final PartitionList PARTITION_LIST = new PartitionList();

    @ParameterizedTest
    @CsvSource({"'1,4,3,2,5,2',3,'1,2,2,4,3,5'"})
    void partition(@ConvertWith(CsvToListNode.class) ListNode head, int x,
                   @ConvertWith(CsvToListNode.class) ListNode expect) {
        assertTrue(ListNodeUtil.isSame(PARTITION_LIST.partition(head, x), expect));
    }
}
