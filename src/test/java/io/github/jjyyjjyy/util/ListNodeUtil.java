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
}
