package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
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
public class RemoveNthNodeFromEndofList {
}
