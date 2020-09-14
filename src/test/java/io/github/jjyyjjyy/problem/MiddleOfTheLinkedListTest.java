package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.ListNode;
import io.github.jjyyjjyy.util.CsvToListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author jy
 */
class MiddleOfTheLinkedListTest {

    private static final MiddleOfTheLinkedList MIDDLE_OF_THE_LINKED_LIST = new MiddleOfTheLinkedList();

    @ParameterizedTest
    @CsvSource({"'1,2,3,4,5',3", "'1,2,3,4,5,6',4"})
    void middleNode(@ConvertWith(CsvToListNode.class) ListNode head, int expect) {
        assertEquals(expect, MIDDLE_OF_THE_LINKED_LIST.middleNode(head).val);
    }
}
