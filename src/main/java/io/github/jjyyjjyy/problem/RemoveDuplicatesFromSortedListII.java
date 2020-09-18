package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.*;

/**
 * <a href="https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list-ii/">删除排序链表中的重复元素 II</a>
 *
 * <p>给定一个排序链表，删除所有含有重复数字的节点，只保留原始链表中&nbsp;<em>没有重复出现&nbsp;</em>的数字。</p>
 *
 * <p><strong>示例&nbsp;1:</strong></p>
 *
 * <pre><strong>输入:</strong> 1-&gt;2-&gt;3-&gt;3-&gt;4-&gt;4-&gt;5
 * <strong>输出:</strong> 1-&gt;2-&gt;5
 * </pre>
 *
 * <p><strong>示例&nbsp;2:</strong></p>
 *
 * <pre><strong>输入:</strong> 1-&gt;1-&gt;1-&gt;2-&gt;3
 * <strong>输出:</strong> 2-&gt;3</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>remove-duplicates-from-sorted-list</li>
 * </ul>
 */
@Problem(
    id = 82,
    name = "remove-duplicates-from-sorted-list-ii",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.LINKED_LIST}
)
public class RemoveDuplicatesFromSortedListII {

    /**
     * 1. 创建一个dummy节点指向head节点.
     * 2. 维护一个快指针prev指向dummy, 一个慢指针next指向head.
     * 3. 如果prev.next不等于next.next, 那么快慢指针都向前进一步.
     * 4. 如果prev.next等于next.next, 说明慢指针所在元素需要被删除. 将慢指针指向与自己相同的最右的节点, prev.next指向next.next, next指向next.next.
     * 5. 返回dummy.next节点即为第一个非重复的节点.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public ListNode deleteDuplicates(ListNode head) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode next = head;

        while (next != null && next.next != null) {
            if (prev.next.val != next.next.val) {
                prev = prev.next;
                next = next.next;
                continue;
            }
            while (next.next != null && next.val == next.next.val) {
                next = next.next;
            }
            prev.next = next.next;
            next = next.next;
        }
        return dummy.next;
    }
}
