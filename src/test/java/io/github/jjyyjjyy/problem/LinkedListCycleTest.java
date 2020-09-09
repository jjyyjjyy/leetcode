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
class LinkedListCycleTest {

    private static final LinkedListCycle LINKED_LIST_CYCLE = new LinkedListCycle();

    @ParameterizedTest
    @CsvSource({"true,'3,2,0,-4',1", "true,'1,2',0", "false,'1',-1"})
    void hasCycle(boolean expect, @AggregateWith(LinkNodeAggregator.class) ListNode listNode) {
        Assertions.assertEquals(expect, LINKED_LIST_CYCLE.hasCycle(listNode));
    }
}
