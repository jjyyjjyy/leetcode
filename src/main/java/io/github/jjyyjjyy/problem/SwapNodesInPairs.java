package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.*;

/**
 * <a href="https://leetcode-cn.com/problems/swap-nodes-in-pairs/">两两交换链表中的节点</a>
 *
 * <p>给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。</p>
 *
 * <p><strong>你不能只是单纯的改变节点内部的值</strong>，而是需要实际的进行节点交换。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre>给定 <code>1-&gt;2-&gt;3-&gt;4</code>, 你应该返回 <code>2-&gt;1-&gt;4-&gt;3</code>.
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>reverse-nodes-in-k-group</li>
 * </ul>
 */
@Problem(
    id = 24,
    name = "swap-nodes-in-pairs",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.LINKED_LIST}
)
public class SwapNodesInPairs {

    /**
     * 1. 构造一个null节点, 指向head.
     * 2. 声明一个prev指针指向之前的节点(默认为dummy), 一个current指针指向当前节点(默认为head).
     * 3. 将current和current.next交换, 然后prev指向current, current指向current.next.next.
     * 4. 一直遍历到current&current.next为空.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode current = head;
        while (current != null && current.next != null) {
            ListNode next = current.next;
            ListNode nextCurrent = next.next;
            prev.next = next;
            current.next = nextCurrent;
            next.next = current;
            prev = current;
            current = nextCurrent;
        }

        return dummy.next;
    }
}
