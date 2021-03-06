package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/maximum-average-subarray-i/">子数组最大平均数 I</a>
 *
 * <p>给定 <code>n</code> 个整数，找出平均数最大且长度为 <code>k</code> 的连续子数组，并输出该最大平均数。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong> [1,12,-5,-6,50,3], k = 4
 * <strong>输出:</strong> 12.75
 * <strong>解释:</strong> 最大平均数 (12-5-6+50)/4 = 51/4 = 12.75
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>注意:</strong></p>
 *
 * <ol>
 * 	<li>1 &lt;= <code>k</code> &lt;= <code>n</code> &lt;= 30,000。</li>
 * 	<li>所给数据范围 [-10,000，10,000]。</li>
 * </ol>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>maximum-average-subarray-ii</li>
 * </ul>
 */
@Problem(
    id = 643,
    name = "maximum-average-subarray-i",
    difficulty = Difficulty.EASY,
    tags = {Tag.ARRAY}
)
public class MaximumAverageSubarrayI {

    public double findMaxAverage(int[] nums, int k) {
        return 0;
    }
}
