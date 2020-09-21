package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.*;

/**
 * <a href="https://leetcode-cn.com/problems/reverse-linked-list-ii/">反转链表 II</a>
 *
 * <p>反转从位置 <em>m</em> 到 <em>n</em> 的链表。请使用一趟扫描完成反转。</p>
 *
 * <p><strong>说明:</strong><br>
 * 1 &le;&nbsp;<em>m</em>&nbsp;&le;&nbsp;<em>n</em>&nbsp;&le; 链表长度。</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre><strong>输入:</strong> 1-&gt;2-&gt;3-&gt;4-&gt;5-&gt;NULL, <em>m</em> = 2, <em>n</em> = 4
 * <strong>输出:</strong> 1-&gt;4-&gt;3-&gt;2-&gt;5-&gt;NULL</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>reverse-linked-list</li>
 * </ul>
 */
@Problem(
    id = 92,
    name = "reverse-linked-list-ii",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.LINKED_LIST}
)
public class ReverseLinkedListII {

    /**
     * 1. 创建一个哑结点指向head.
     * 2. 维护prev指针指向dummy, current指针指向head.
     * 3. 将prev和current指针前进m-1位.
     * 4. 遍历链表n-m次: current.next -> next.next, next.next -> prev.next, prev.next -> next.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode current = head;

        int start = m;
        while (start > 1) {
            prev = current;
            current = current.next;
            start--;
        }

        int delta = n - m;
        while (delta > 0) {
            ListNode next = current.next;
            current.next = next.next;
            next.next = prev.next;
            prev.next = next;
            delta--;
        }
        return dummy.next;
    }
}
