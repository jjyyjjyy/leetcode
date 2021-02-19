package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/max-consecutive-ones-iii/">最大连续1的个数 III</a>
 *
 * <p>给定一个由若干 <code>0</code> 和 <code>1</code> 组成的数组&nbsp;<code>A</code>，我们最多可以将&nbsp;<code>K</code>&nbsp;个值从 0 变成 1 。</p>
 *
 * <p>返回仅包含 1 的最长（连续）子数组的长度。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><strong>输入：</strong>A = [1,1,1,0,0,0,1,1,1,1,0], K = 2
 * <strong>输出：</strong>6
 * <strong>解释： </strong>
 * [1,1,1,0,0,<strong>1</strong>,1,1,1,1,<strong>1</strong>]
 * 粗体数字从 0 翻转到 1，最长的子数组长度为 6。</pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre><strong>输入：</strong>A = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], K = 3
 * <strong>输出：</strong>10
 * <strong>解释：</strong>
 * [0,0,1,1,<strong>1</strong>,<strong>1</strong>,1,1,1,<strong>1</strong>,1,1,0,0,0,1,1,1,1]
 * 粗体数字从 0 翻转到 1，最长的子数组长度为 10。</pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ol>
 * 	<li><code>1 &lt;= A.length &lt;= 20000</code></li>
 * 	<li><code>0 &lt;= K &lt;= A.length</code></li>
 * 	<li><code>A[i]</code> 为&nbsp;<code>0</code>&nbsp;或&nbsp;<code>1</code>&nbsp;</li>
 * </ol>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>longest-substring-with-at-most-k-distinct-characters</li>
 *   <li>longest-repeating-character-replacement</li>
 *   <li>max-consecutive-ones</li>
 *   <li>max-consecutive-ones-ii</li>
 * </ul>
 */
@Problem(
    id = 1004,
    name = "max-consecutive-ones-iii",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.TWO_POINTERS, Tag.SLIDING_WINDOW}
)
public class MaxConsecutiveOnesIII {

    public int longestOnes(int[] A, int K) {
        return -1;
    }
}
