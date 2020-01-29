package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/flip-columns-for-maximum-number-of-equal-rows/">按列翻转得到最大值等行数</a>
 *
 * <p>给定由若干 0 和 1 组成的矩阵&nbsp;<code>matrix</code>，从中选出任意数量的列并翻转其上的&nbsp;<strong>每个&nbsp;</strong>单元格。翻转后，单元格的值从 0 变成 1，或者从 1 变为 0 。</p>
 *
 * <p>返回经过一些翻转后，行上所有值都相等的最大行数。</p>
 *
 * <p>&nbsp;</p>
 *
 * <ol>
 * </ol>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><strong>输入：</strong>[[0,1],[1,1]]
 * <strong>输出：</strong>1
 * <strong>解释：</strong>不进行翻转，有 1 行所有值都相等。
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre><strong>输入：</strong>[[0,1],[1,0]]
 * <strong>输出：</strong>2
 * <strong>解释：</strong>翻转第一列的值之后，这两行都由相等的值组成。
 * </pre>
 *
 * <p><strong>示例 3：</strong></p>
 *
 * <pre><strong>输入：</strong>[[0,0,0],[0,0,1],[1,1,0]]
 * <strong>输出：</strong>2
 * <strong>解释：</strong>翻转前两列的值之后，后两行由相等的值组成。</pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ol>
 * 	<li><code>1 &lt;= matrix.length &lt;= 300</code></li>
 * 	<li><code>1 &lt;= matrix[i].length &lt;= 300</code></li>
 * 	<li>所有 <code>matrix[i].length</code>&nbsp;都相等</li>
 * 	<li><code>matrix[i][j]</code> 为&nbsp;<code>0</code> 或&nbsp;<code>1</code></li>
 * </ol>
 */
@Problem(
    id = 1147,
    name = "flip-columns-for-maximum-number-of-equal-rows",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.HASH_TABLE}
)
public class FlipColumnsForMaximumNumberofEqualRows {
}
