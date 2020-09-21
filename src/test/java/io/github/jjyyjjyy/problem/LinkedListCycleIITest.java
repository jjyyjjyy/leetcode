package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.ListNode;
import io.github.jjyyjjyy.util.LinkNodeAggregator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.aggregator.AggregateWith;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * @author jy
 */
class LinkedListCycleIITest {

    private static final LinkedListCycleII LINKED_LIST_CYCLE_II = new LinkedListCycleII();

    @ParameterizedTest
    @CsvSource(value = {"2,'3,2,0,-4',1", "1,'1,2',0", "nil,'1',-1"}, nullValues = "nil")
    void detectCycle(Integer expect, @AggregateWith(LinkNodeAggregator.class) ListNode listNode) {
        ListNode result = LINKED_LIST_CYCLE_II.detectCycle(listNode);
        if (expect == null) {
            Assertions.assertNull(result);
        } else {
            Assertions.assertEquals(expect, result.val);
        }
    }
}
