package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author jy
 */
class IntersectionofTwoLinkedListsTest {

    private static final IntersectionofTwoLinkedLists INTERSECTIONOF_TWO_LINKED_LISTS = new IntersectionofTwoLinkedLists();

    @Test
    void getIntersectionNode() {
        ListNode headA = new ListNode(1);
        ListNode headB = new ListNode(2);
        Assertions.assertNull(INTERSECTIONOF_TWO_LINKED_LISTS.getIntersectionNode(headA, headB));

        headA.next = headB;
        Assertions.assertSame(headB, INTERSECTIONOF_TWO_LINKED_LISTS.getIntersectionNode(headA, headB));
    }
}
