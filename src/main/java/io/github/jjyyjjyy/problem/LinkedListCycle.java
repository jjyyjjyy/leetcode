package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.ListNode;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/linked-list-cycle/">环形链表</a>
 *
 * <p>给定一个链表，判断链表中是否有环。</p>
 *
 * <p>为了表示给定链表中的环，我们使用整数 <code>pos</code> 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 <code>pos</code> 是 <code>-1</code>，则在该链表中没有环。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><strong>输入：</strong>head = [3,2,0,-4], pos = 1
 * <strong>输出：</strong>true
 * <strong>解释：</strong>链表中有一个环，其尾部连接到第二个节点。
 * </pre>
 *
 * <p><img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/12/07/circularlinkedlist.png" style="height: 97px; width: 300px;"></p>
 *
 * <p><strong>示例&nbsp;2：</strong></p>
 *
 * <pre><strong>输入：</strong>head = [1,2], pos = 0
 * <strong>输出：</strong>true
 * <strong>解释：</strong>链表中有一个环，其尾部连接到第一个节点。
 * </pre>
 *
 * <p><img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/12/07/circularlinkedlist_test2.png" style="height: 74px; width: 141px;"></p>
 *
 * <p><strong>示例 3：</strong></p>
 *
 * <pre><strong>输入：</strong>head = [1], pos = -1
 * <strong>输出：</strong>false
 * <strong>解释：</strong>链表中没有环。
 * </pre>
 *
 * <p><img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/12/07/circularlinkedlist_test3.png" style="height: 45px; width: 45px;"></p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>进阶：</strong></p>
 *
 * <p>你能用 <em>O(1)</em>（即，常量）内存解决此问题吗？</p>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>linked-list-cycle-ii</li>
 *   <li>happy-number</li>
 * </ul>
 */
@Problem(
    id = 141,
    name = "linked-list-cycle",
    difficulty = Difficulty.EASY,
    tags = {Tag.LINKED_LIST, Tag.TWO_POINTERS}
)
public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        return false;
    }
}
