package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/binary-subarrays-with-sum/">和相同的二元子数组</a>
 *
 * <p>在由若干&nbsp;<code>0</code>&nbsp;和&nbsp;<code>1</code>&nbsp; 组成的数组&nbsp;<code>A</code>&nbsp;中，有多少个和为 <code>S</code>&nbsp;的<strong>非空</strong>子数组。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例：</strong></p>
 *
 * <pre><strong>输入：</strong>A = [1,0,1,0,1], S = 2
 * <strong>输出：</strong>4
 * <strong>解释：</strong>
 * 如下面黑体所示，有 4 个满足题目要求的子数组：
 * [<strong>1,0,1</strong>,0,1]
 * [<strong>1,0,1,0</strong>,1]
 * [1,<strong>0,1,0,1</strong>]
 * [1,0,<strong>1,0,1</strong>]
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ol>
 * 	<li><code>A.length &lt;= 30000</code></li>
 * 	<li><code>0 &lt;= S &lt;= A.length</code></li>
 * 	<li><code>A[i]</code>&nbsp;为&nbsp;<code>0</code>&nbsp;或&nbsp;<code>1</code></li>
 * </ol>
 */
@Problem(
    id = 966,
    name = "binary-subarrays-with-sum",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.HASH_TABLE, Tag.TWO_POINTERS}
)
public class BinarySubarraysWithSum {
}
