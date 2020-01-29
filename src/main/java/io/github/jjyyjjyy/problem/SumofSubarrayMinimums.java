package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/sum-of-subarray-minimums/">子数组的最小值之和</a>
 *
 * <p>给定一个整数数组 <code>A</code>，找到 <code>min(B)</code>&nbsp;的总和，其中 <code>B</code> 的范围为&nbsp;<code>A</code> 的每个（连续）子数组。</p>
 *
 * <p>由于答案可能很大，因此<strong>返回答案模 <code>10^9 + 7</code></strong>。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例：</strong></p>
 *
 * <pre><strong>输入：</strong>[3,1,2,4]
 * <strong>输出：</strong>17
 * <strong>解释：
 * 子数组为 </strong>[3]，[1]，[2]，[4]，[3,1]，[1,2]，[2,4]，[3,1,2]，[1,2,4]，[3,1,2,4]。
 * 最小值为 3，1，2，4，1，1，2，1，1，1，和为 17。</pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ol>
 * 	<li><code>1 &lt;= A &lt;= 30000</code></li>
 * 	<li><code>1 &lt;= A[i] &lt;= 30000</code></li>
 * </ol>
 *
 * <p>&nbsp;</p>
 */
@Problem(
    id = 943,
    name = "sum-of-subarray-minimums",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.STACK, Tag.ARRAY}
)
public class SumofSubarrayMinimums {
}
