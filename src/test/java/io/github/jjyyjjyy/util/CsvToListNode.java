package io.github.jjyyjjyy.util;

import io.github.jjyyjjyy.core.ListNode;
import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.SimpleArgumentConverter;

import java.util.Arrays;

import static io.github.jjyyjjyy.util.CsvToArray.ARRAY_SPLITTER_REGEX;

/**
 * @author jy
 */
public class CsvToListNode extends SimpleArgumentConverter {

    @Override
    protected Object convert(Object source, Class<?> targetType) throws ArgumentConversionException {
        String sourceString = source.toString();
        if ("null".equals(sourceString)) {
            return null;
        }
        String[] strings = sourceString.split(ARRAY_SPLITTER_REGEX);
        int[] arr = Arrays.stream(strings).mapToInt(Integer::valueOf).toArray();

        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            ListNode next = new ListNode(arr[i]);
            current.next = next;
            current = next;
        }
        return head;
    }
}
