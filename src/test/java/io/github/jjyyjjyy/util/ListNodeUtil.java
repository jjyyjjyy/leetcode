package io.github.jjyyjjyy.util;

import io.github.jjyyjjyy.core.ListNode;

/**
 * @author jy
 */
public class ListNodeUtil {

    public static boolean isSame(ListNode target, ListNode expect) {
        while (true) {
            if (expect == null) {
                return target == null;
            }
            if (target == null || target.val != expect.val) {
                return false;
            }
            target = target.next;
            expect = expect.next;
        }
    }

    public static ListNode get(ListNode head, int index) {
        for (int i = 0; i < index; i++) {
            if (head == null) {
                return null;
            }
            head = head.next;
        }
        return head;
    }
}
