package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.ListNode;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

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

    public boolean isPalindrome(ListNode head) {
        return false;

    }

}
