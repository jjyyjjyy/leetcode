package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/reverse-nodes-in-k-group/">K 个一组翻转链表</a>
 *
 * <p>给你一个链表，每&nbsp;<em>k&nbsp;</em>个节点一组进行翻转，请你返回翻转后的链表。</p>
 *
 * <p><em>k&nbsp;</em>是一个正整数，它的值小于或等于链表的长度。</p>
 *
 * <p>如果节点总数不是&nbsp;<em>k&nbsp;</em>的整数倍，那么请将最后剩余的节点保持原有顺序。</p>
 *
 * <p><strong>示例 :</strong></p>
 *
 * <p>给定这个链表：<code>1-&gt;2-&gt;3-&gt;4-&gt;5</code></p>
 *
 * <p>当&nbsp;<em>k&nbsp;</em>= 2 时，应当返回: <code>2-&gt;1-&gt;4-&gt;3-&gt;5</code></p>
 *
 * <p>当&nbsp;<em>k&nbsp;</em>= 3 时，应当返回: <code>3-&gt;2-&gt;1-&gt;4-&gt;5</code></p>
 *
 * <p><strong>说明 :</strong></p>
 *
 * <ul>
 * 	<li>你的算法只能使用常数的额外空间。</li>
 * 	<li><strong>你不能只是单纯的改变节点内部的值</strong>，而是需要实际的进行节点交换。</li>
 * </ul>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>swap-nodes-in-pairs</li>
 * </ul>
 */
@Problem(
    id = 25,
    name = "reverse-nodes-in-k-group",
    difficulty = Difficulty.HARD,
    tags = {Tag.LINKED_LIST}
)
public class ReverseNodesinkGroup {
}
