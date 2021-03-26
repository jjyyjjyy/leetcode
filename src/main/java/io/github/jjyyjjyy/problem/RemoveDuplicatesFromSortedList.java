package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.*;

/**
 * <a href="https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/">删除排序链表中的重复元素</a>
 *
 * <p>给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。</p>
 *
 * <p><strong>示例&nbsp;1:</strong></p>
 *
 * <pre><strong>输入:</strong> 1-&gt;1-&gt;2
 * <strong>输出:</strong> 1-&gt;2
 * </pre>
 *
 * <p><strong>示例&nbsp;2:</strong></p>
 *
 * <pre><strong>输入:</strong> 1-&gt;1-&gt;2-&gt;3-&gt;3
 * <strong>输出:</strong> 1-&gt;2-&gt;3</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>remove-duplicates-from-sorted-list-ii</li>
 * </ul>
 */
@Problem(
    id = 83,
    name = "remove-duplicates-from-sorted-list",
    difficulty = Difficulty.EASY,
    tags = {Tag.LINKED_LIST}
)
public class RemoveDuplicatesFromSortedList {

    /**
     * 遍历链表, 如果下一个节点与当前节点相同, 则将当前节点的next指向下一个节点的next.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            ListNode next = current.next;
            if (next.val == current.val) {
                current.next = next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}
