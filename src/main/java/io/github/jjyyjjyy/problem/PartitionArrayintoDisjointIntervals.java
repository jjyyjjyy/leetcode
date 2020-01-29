package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/partition-array-into-disjoint-intervals/">分割数组</a>
 *
 * <p>给定一个数组&nbsp;<code>A</code>，将其划分为两个不相交（没有公共元素）的连续子数组&nbsp;<code>left</code>&nbsp;和&nbsp;<code>right</code>，&nbsp;使得：</p>
 *
 * <ul>
 * 	<li><code>left</code>&nbsp;中的每个元素都小于或等于&nbsp;<code>right</code>&nbsp;中的每个元素。</li>
 * 	<li><code>left</code> 和&nbsp;<code>right</code>&nbsp;都是非空的。</li>
 * 	<li><code>left</code>&nbsp;要尽可能小。</li>
 * </ul>
 *
 * <p>在完成这样的分组后返回&nbsp;<code>left</code>&nbsp;的<strong>长度</strong>。可以保证存在这样的划分方法。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><strong>输入：</strong>[5,0,3,8,6]
 * <strong>输出：</strong>3
 * <strong>解释：</strong>left = [5,0,3]，right = [8,6]
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre><strong>输入：</strong>[1,1,1,0,6,12]
 * <strong>输出：</strong>4
 * <strong>解释：</strong>left = [1,1,1,0]，right = [6,12]
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ol>
 * 	<li><code>2 &lt;= A.length&nbsp;&lt;= 30000</code></li>
 * 	<li><code>0 &lt;= A[i] &lt;= 10^6</code></li>
 * 	<li>可以保证至少有一种方法能够按题目所描述的那样对 <code>A</code> 进行划分。</li>
 * </ol>
 *
 * <p>&nbsp;</p>
 */
@Problem(
    id = 951,
    name = "partition-array-into-disjoint-intervals",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.ARRAY}
)
public class PartitionArrayintoDisjointIntervals {
}
