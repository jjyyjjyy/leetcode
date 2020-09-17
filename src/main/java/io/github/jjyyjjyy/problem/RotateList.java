package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.*;

/**
 * <a href="https://leetcode-cn.com/problems/rotate-list/">旋转链表</a>
 *
 * <p>给定一个链表，旋转链表，将链表每个节点向右移动&nbsp;<em>k&nbsp;</em>个位置，其中&nbsp;<em>k&nbsp;</em>是非负数。</p>
 *
 * <p><strong>示例&nbsp;1:</strong></p>
 *
 * <pre><strong>输入:</strong> 1-&gt;2-&gt;3-&gt;4-&gt;5-&gt;NULL, k = 2
 * <strong>输出:</strong> 4-&gt;5-&gt;1-&gt;2-&gt;3-&gt;NULL
 * <strong>解释:</strong>
 * 向右旋转 1 步: 5-&gt;1-&gt;2-&gt;3-&gt;4-&gt;NULL
 * 向右旋转 2 步: 4-&gt;5-&gt;1-&gt;2-&gt;3-&gt;NULL
 * </pre>
 *
 * <p><strong>示例&nbsp;2:</strong></p>
 *
 * <pre><strong>输入:</strong> 0-&gt;1-&gt;2-&gt;NULL, k = 4
 * <strong>输出:</strong> <code>2-&gt;0-&gt;1-&gt;NULL</code>
 * <strong>解释:</strong>
 * 向右旋转 1 步: 2-&gt;0-&gt;1-&gt;NULL
 * 向右旋转 2 步: 1-&gt;2-&gt;0-&gt;NULL
 * 向右旋转 3 步:&nbsp;<code>0-&gt;1-&gt;2-&gt;NULL</code>
 * 向右旋转 4 步:&nbsp;<code>2-&gt;0-&gt;1-&gt;NULL</code></pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>rotate-array</li>
 *   <li>split-linked-list-in-parts</li>
 * </ul>
 */
@Problem(
    id = 61,
    name = "rotate-list",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.LINKED_LIST, Tag.TWO_POINTERS}
)
public class RotateList {

    /**
     * 1. 先计算链表长度, 并找到尾结点, 将尾节点的next指向head.
     * 2. 遍历到新尾结点(n-k%n-1), 将新尾结点的next置为null.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode tail = head;
        int length = 1;
        while (tail.next != null) {
            length++;
            tail = tail.next;
        }

        tail.next = head;

        ListNode newTail = head;
        int tailIndex = (length - k % length) - 1;

        for (int i = 0; i < tailIndex; i++) {
            newTail = newTail.next;
        }
        ListNode newHead = newTail.next;

        newTail.next = null;

        return newHead;
    }
}
