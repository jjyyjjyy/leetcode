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
class SwapNodesInPairsTest {

    private static final SwapNodesInPairs SWAP_NODES_IN_PAIRS = new SwapNodesInPairs();

    @ParameterizedTest
    @CsvSource({"'1,2,3,4','2,1,4,3'"})
    void swapPairs(@ConvertWith(CsvToListNode.class) ListNode head,
                   @ConvertWith(CsvToListNode.class) ListNode expect) {
        Assertions.assertTrue(ListNodeUtil.isSame(SWAP_NODES_IN_PAIRS.swapPairs(head), expect));
    }
}
