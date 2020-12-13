package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.*;

/**
 * <a href="https://leetcode-cn.com/problems/sort-list/">排序链表</a>
 *
 * <p>在&nbsp;<em>O</em>(<em>n</em>&nbsp;log&nbsp;<em>n</em>) 时间复杂度和常数级空间复杂度下，对链表进行排序。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong> 4-&gt;2-&gt;1-&gt;3
 * <strong>输出:</strong> 1-&gt;2-&gt;3-&gt;4
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre><strong>输入:</strong> -1-&gt;5-&gt;3-&gt;4-&gt;0
 * <strong>输出:</strong> -1-&gt;0-&gt;3-&gt;4-&gt;5</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>merge-two-sorted-lists</li>
 *   <li>sort-colors</li>
 *   <li>insertion-sort-list</li>
 * </ul>
 */
@Problem(
    id = 148,
    name = "sort-list",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.SORT, Tag.LINKED_LIST}
)
public class SortList {

    /**
     * 归并排序
     */
    @Complexity(Complexity.ComplexityType.O_N_LOG_N)
    public ListNode sortList(ListNode head) {
        return sortList(head, null);
    }

    private ListNode sortList(ListNode head, ListNode tail) {
        if (head == null) {
            return null;
        }
        if (head.next == tail) {
            head.next = null;
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != tail) {
            slow = slow.next;
            fast = fast.next;
            if (fast != tail) {
                fast = fast.next;
            }
        }
        ListNode left = sortList(head, slow);
        ListNode right = sortList(slow, tail);
        return merge(left, right);
    }

    private ListNode merge(ListNode left, ListNode right) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        while (left != null && right != null) {
            if (left.val <= right.val) {
                current.next = left;
                left = left.next;
            } else {
                current.next = right;
                right = right.next;
            }
            current = current.next;
        }
        if (left != null) {
            current.next = left;
        }
        if (right != null) {
            current.next = right;
        }
        return dummy.next;
    }
}
