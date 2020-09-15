package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.ListNode;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/">删除链表的倒数第N个节点</a>
 *
 * <p>给定一个链表，删除链表的倒数第&nbsp;<em>n&nbsp;</em>个节点，并且返回链表的头结点。</p>
 *
 * <p><strong>示例：</strong></p>
 *
 * <pre>给定一个链表: <strong>1-&gt;2-&gt;3-&gt;4-&gt;5</strong>, 和 <strong><em>n</em> = 2</strong>.
 *
 * 当删除了倒数第二个节点后，链表变为 <strong>1-&gt;2-&gt;3-&gt;5</strong>.
 * </pre>
 *
 * <p><strong>说明：</strong></p>
 *
 * <p>给定的 <em>n</em>&nbsp;保证是有效的。</p>
 *
 * <p><strong>进阶：</strong></p>
 *
 * <p>你能尝试使用一趟扫描实现吗？</p>
 */
@Problem(
    id = 19,
    name = "remove-nth-node-from-end-of-list",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.LINKED_LIST, Tag.TWO_POINTERS}
)
public class RemoveNthNodeFromEndOfList {

    /**
     * 1. 维护一个空节点, 指向head.
     * 2. 维护一个快指针和一个满指针指向空节点. 快指针首先向右移动n+1位.
     * 3. 快慢指针同时向右移动, 直到快指针遍历完链表.
     * 4. 此时慢指针的下一位即为要删除的那个元素, 将next指向next.next即可.
     * 5. 返回空指针的下一个节点.
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode left = dummy;
        ListNode right = dummy;

        for (int i = 0; i <= n; i++) {
            right = right.next;
        }
        while (right != null) {
            right = right.next;
            left = left.next;
        }

        left.next = left.next.next;
        return dummy.next;
    }
}
