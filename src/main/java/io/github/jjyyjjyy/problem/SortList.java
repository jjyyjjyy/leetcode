package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/sort-list/">排序链表</a>
 *
 * <p>在&nbsp;<em>O</em>(<em>n</em>&nbsp;log&nbsp;<em>n</em>) 时间复杂度和常数级空间复杂度下，对链表进行排序。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong> 4-&gt;2-&gt;1-&gt;3
 * <strong>输出:</strong> 1-&gt;2-&gt;3-&gt;4
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre><strong>输入:</strong> -1-&gt;5-&gt;3-&gt;4-&gt;0
 * <strong>输出:</strong> -1-&gt;0-&gt;3-&gt;4-&gt;5</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>merge-two-sorted-lists</li>
 *   <li>sort-colors</li>
 *   <li>insertion-sort-list</li>
 * </ul>
 */
@Problem(
    id = 148,
    name = "sort-list",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.SORT, Tag.LINKED_LIST}
)
public class SortList {
}
