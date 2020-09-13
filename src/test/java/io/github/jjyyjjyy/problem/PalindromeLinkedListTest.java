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
class PalindromeLinkedListTest {

    private static final PalindromeLinkedList PALINDROME_LINKED_LIST = new PalindromeLinkedList();

    @ParameterizedTest
    @CsvSource({"'1,2', false", "'1,2,2,1', true"})
    void isPalindrome(@ConvertWith(CsvToListNode.class) ListNode head, boolean expect) {
        assertEquals(expect, PALINDROME_LINKED_LIST.isPalindrome(head));
    }
}
