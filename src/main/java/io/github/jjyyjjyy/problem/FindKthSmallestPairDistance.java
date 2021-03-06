package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/find-k-th-smallest-pair-distance/">找出第 k 小的距离对</a>
 *
 * <p>给定一个整数数组，返回所有数对之间的第 k 个最小<strong>距离</strong>。一对 (A, B) 的距离被定义为 A 和 B 之间的绝对差值。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>
 * nums = [1,3,1]
 * k = 1
 * <strong>输出：0</strong>
 * <strong>解释：</strong>
 * 所有数对如下：
 * (1,3) -&gt; 2
 * (1,1) -&gt; 0
 * (3,1) -&gt; 2
 * 因此第 1 个最小距离的数对是 (1,1)，它们之间的距离为 0。
 * </pre>
 *
 * <p><strong>提示:</strong></p>
 *
 * <ol>
 * 	<li><code>2 &lt;= len(nums) &lt;= 10000</code>.</li>
 * 	<li><code>0 &lt;= nums[i] &lt; 1000000</code>.</li>
 * 	<li><code>1 &lt;= k &lt;= len(nums) * (len(nums) - 1) / 2</code>.</li>
 * </ol>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>find-k-pairs-with-smallest-sums</li>
 *   <li>kth-smallest-element-in-a-sorted-matrix</li>
 *   <li>find-k-closest-elements</li>
 *   <li>kth-smallest-number-in-multiplication-table</li>
 *   <li>k-th-smallest-prime-fraction</li>
 * </ul>
 */
@Problem(
    id = 719,
    name = "find-k-th-smallest-pair-distance",
    difficulty = Difficulty.HARD,
    tags = {Tag.HEAP, Tag.ARRAY, Tag.BINARY_SEARCH}
)
public class FindKthSmallestPairDistance {
}
