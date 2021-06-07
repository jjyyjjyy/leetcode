package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/target-sum/">目标和</a>
 *
 * <p>给定一个非负整数数组，a1, a2, ..., an, 和一个目标数，S。现在你有两个符号&nbsp;<code>+</code>&nbsp;和&nbsp;<code>-</code>。对于数组中的任意一个整数，你都可以从&nbsp;<code>+</code>&nbsp;或&nbsp;<code>-</code>中选择一个符号添加在前面。</p>
 *
 * <p>返回可以使最终数组和为目标数 S 的所有添加符号的方法数。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong> nums: [1, 1, 1, 1, 1], S: 3
 * <strong>输出:</strong> 5
 * <strong>解释:</strong>
 *
 * -1+1+1+1+1 = 3
 * +1-1+1+1+1 = 3
 * +1+1-1+1+1 = 3
 * +1+1+1-1+1 = 3
 * +1+1+1+1-1 = 3
 *
 * 一共有5种方法让最终目标和为3。
 * </pre>
 *
 * <p><strong>注意:</strong></p>
 *
 * <ol>
 * 	<li>数组非空，且长度不会超过20。</li>
 * 	<li>初始的数组的和不会超过1000。</li>
 * 	<li>保证返回的最终结果能被32位整数存下。</li>
 * </ol>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>expression-add-operators</li>
 * </ul>
 */
@Problem(
    id = 494,
    name = "target-sum",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.DEPTH_FIRST_SEARCH, Tag.DYNAMIC_PROGRAMMING}
)
public class TargetSum {

    /**
     * 1. 维护一个dp数组标识前i个元素等于j的方案数.
     * 2. 如果j小于num, 则即使所有元素都为正数都无法得到num, dp[i][j] = dp[i-1][j], 否则dp[i][j]等于前i-1个数等于j的方案数加上前i-1个数等于j-num的方案数, 即dp[i-1][j] + dp[i-1][j-num].
     */
    @Complexity(value = Complexity.ComplexityType.O_DEFINE, complexity = "O(n×(sum−target))")
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int diff = sum - target;
        if (diff < 0 || (diff & 1) == 1) {
            return 0;
        }
        int n = nums.length;
        int neg = diff / 2;
        int[][] dp = new int[n + 1][neg + 1];
        dp[0][0] = 1;
        for (int i = 1; i <= n; i++) {
            int num = nums[i - 1];
            for (int j = 0; j <= neg; j++) {
                dp[i][j] = dp[i - 1][j];
                if (num <= j) {
                    dp[i][j] += dp[i - 1][j - num];
                }
            }
        }
        return dp[n][neg];
    }

}
