package io.github.jjyyjjyy.util;

import io.github.jjyyjjyy.core.ListNode;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.aggregator.ArgumentsAggregationException;
import org.junit.jupiter.params.aggregator.ArgumentsAggregator;

import java.util.Arrays;

/**
 * @author jy
 */
public class LinkNodeAggregator implements ArgumentsAggregator {

    @Override
    public Object aggregateArguments(ArgumentsAccessor accessor, ParameterContext context) throws ArgumentsAggregationException {

        int size = accessor.size();
        int[] ints = Arrays.stream(accessor.getString(size - 2).split(CsvToArray.ARRAY_SPLITTER_REGEX)).mapToInt(Integer::parseInt).toArray();
        int loopIndex = Integer.parseInt(accessor.getString(size - 1));
        ListNode head = new ListNode(ints[0]);
        ListNode current = head;

        int i = 1;
        while (i < ints.length) {
            ListNode next = new ListNode(ints[i]);
            current.next = next;
            current = next;
            i++;
        }

        ListNode tail = current;

        if (loopIndex < 0) {
            return head;
        }

        current = head;
        for (int j = 1; j <= loopIndex; j++) {
            current = current.next;
        }
        tail.next = current;

        return head;
    }
}
