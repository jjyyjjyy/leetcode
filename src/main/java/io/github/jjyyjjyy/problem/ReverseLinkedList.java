package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.*;

/**
 * <a href="https://leetcode-cn.com/problems/reverse-linked-list/">反转链表</a>
 *
 * <p>反转一个单链表。</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre><strong>输入:</strong> 1-&gt;2-&gt;3-&gt;4-&gt;5-&gt;NULL
 * <strong>输出:</strong> 5-&gt;4-&gt;3-&gt;2-&gt;1-&gt;NULL</pre>
 *
 * <p><strong>进阶:</strong><br>
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？</p>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>reverse-linked-list-ii</li>
 *   <li>binary-tree-upside-down</li>
 *   <li>palindrome-linked-list</li>
 * </ul>
 */
@Problem(
    id = 206,
    name = "reverse-linked-list",
    difficulty = Difficulty.EASY,
    tags = {Tag.LINKED_LIST}
)
public class ReverseLinkedList {

    /**
     * 迭代法.
     * 依次遍历链表, 使得当前节点的下一个节点指向前一个节点.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    /**
     * 递归法.
     * 遍历链表, 使得p.next.next=p.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p = reverseList2(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }

}
