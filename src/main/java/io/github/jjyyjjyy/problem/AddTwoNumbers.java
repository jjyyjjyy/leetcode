package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.*;

/**
 * <a href="https://leetcode-cn.com/problems/add-two-numbers/">两数相加</a>
 *
 * <p>给出两个&nbsp;<strong>非空</strong> 的链表用来表示两个非负的整数。其中，它们各自的位数是按照&nbsp;<strong>逆序</strong>&nbsp;的方式存储的，并且它们的每个节点只能存储&nbsp;<strong>一位</strong>&nbsp;数字。</p>
 *
 * <p>如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。</p>
 *
 * <p>您可以假设除了数字 0 之外，这两个数都不会以 0&nbsp;开头。</p>
 *
 * <p><strong>示例：</strong></p>
 *
 * <pre><strong>输入：</strong>(2 -&gt; 4 -&gt; 3) + (5 -&gt; 6 -&gt; 4)
 * <strong>输出：</strong>7 -&gt; 0 -&gt; 8
 * <strong>原因：</strong>342 + 465 = 807
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>multiply-strings</li>
 *   <li>add-binary</li>
 *   <li>sum-of-two-integers</li>
 *   <li>add-strings</li>
 *   <li>add-two-numbers-ii</li>
 *   <li>add-to-array-form-of-integer</li>
 * </ul>
 */
@Problem(
    id = 2,
    name = "add-two-numbers",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.LINKED_LIST, Tag.MATH}
)
public class AddTwoNumbers {

    @Complexity(Complexity.ComplexityType.O_M_AND_N)
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode current = head;
        int tmp = 0;
        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + tmp;
            tmp = sum / 10;
            ListNode next = new ListNode(sum % 10);
            current.next = next;
            current = next;
            l1 = l1.next;
            l2 = l2.next;
        }
        ListNode remainder = l1 == null ? l2 : l1;
        while (remainder != null) {
            int sum = remainder.val + tmp;
            tmp = sum / 10;
            ListNode next = new ListNode(sum % 10);
            current.next = next;
            current = next;
            remainder = remainder.next;
        }
        if (tmp > 0) {
            current.next = new ListNode(tmp);
        }
        return head.next;
    }

}
