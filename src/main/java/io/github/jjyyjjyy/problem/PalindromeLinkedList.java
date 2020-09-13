package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.*;

/**
 * <a href="https://leetcode-cn.com/problems/palindrome-linked-list/">回文链表</a>
 *
 * <p>请判断一个链表是否为回文链表。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong> 1-&gt;2
 * <strong>输出:</strong> false</pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre><strong>输入:</strong> 1-&gt;2-&gt;2-&gt;1
 * <strong>输出:</strong> true
 * </pre>
 *
 * <p><strong>进阶：</strong><br>
 * 你能否用&nbsp;O(n) 时间复杂度和 O(1) 空间复杂度解决此题？</p>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>palindrome-number</li>
 *   <li>valid-palindrome</li>
 *   <li>reverse-linked-list</li>
 * </ul>
 */
@Problem(
    id = 234,
    name = "palindrome-linked-list",
    difficulty = Difficulty.EASY,
    tags = {Tag.LINKED_LIST, Tag.TWO_POINTERS}
)
public class PalindromeLinkedList {

    /**
     * 1. 使用双指针找到链表中间的元素.
     * 2. 翻转后半部分的链表.
     * 3. 依次比较开头和后半部分的元素, 得到比较结果.
     * 4. 再次翻转后半部分的链表, 恢复链表元素顺序.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }
        ListNode midNode = findMidNode(head);
        ListNode second = reverseList(midNode.next);

        boolean result = true;

        ListNode p1 = head;
        ListNode p2 = second;

        while (result && p2 != null) {
            if (p1.val != p2.val) {
                result = false;
                break;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        midNode.next = reverseList(second);

        return result;

    }

    private ListNode reverseList(ListNode head) {
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

    private ListNode findMidNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }

}
