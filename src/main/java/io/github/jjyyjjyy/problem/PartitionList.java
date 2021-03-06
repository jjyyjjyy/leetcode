package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.ListNode;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/partition-list/">分隔链表</a>
 *
 * <p>给定一个链表和一个特定值<em> x</em>，对链表进行分隔，使得所有小于 <em>x</em> 的节点都在大于或等于 <em>x</em> 的节点之前。</p>
 *
 * <p>你应当保留两个分区中每个节点的初始相对位置。</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre><strong>输入:</strong> head = 1-&gt;4-&gt;3-&gt;2-&gt;5-&gt;2, <em>x</em> = 3
 * <strong>输出:</strong> 1-&gt;2-&gt;2-&gt;4-&gt;3-&gt;5
 * </pre>
 */
@Problem(
    id = 86,
    name = "partition-list",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.LINKED_LIST, Tag.TWO_POINTERS}
)
public class PartitionList {

    public ListNode partition(ListNode head, int x) {
        return null;
    }
}
