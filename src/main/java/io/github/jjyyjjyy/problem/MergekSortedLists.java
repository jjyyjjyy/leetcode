package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/merge-k-sorted-lists/">合并K个排序链表</a>
 *
 * <p>合并&nbsp;<em>k&nbsp;</em>个排序链表，返回合并后的排序链表。请分析和描述算法的复杂度。</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre><strong>输入:</strong>
 * [
 * &nbsp; 1-&gt;4-&gt;5,
 * &nbsp; 1-&gt;3-&gt;4,
 * &nbsp; 2-&gt;6
 * ]
 * <strong>输出:</strong> 1-&gt;1-&gt;2-&gt;3-&gt;4-&gt;4-&gt;5-&gt;6</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>merge-two-sorted-lists</li>
 *   <li>ugly-number-ii</li>
 * </ul>
 */
@Problem(
    id = 23,
    name = "merge-k-sorted-lists",
    difficulty = Difficulty.HARD,
    tags = {Tag.HEAP, Tag.LINKED_LIST, Tag.DIVIDE_AND_CONQUER}
)
public class MergekSortedLists {
}
