package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/house-robber/">打家劫舍</a>
 *
 * <p>你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，<strong>如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警</strong>。</p>
 *
 * <p>给定一个代表每个房屋存放金额的非负整数数组，计算你<strong>在不触动警报装置的情况下，</strong>能够偷窃到的最高金额。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong> [1,2,3,1]
 * <strong>输出:</strong> 4
 * <strong>解释:</strong> 偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。
 * &nbsp;    偷窃到的最高金额 = 1 + 3 = 4 。</pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre><strong>输入:</strong> [2,7,9,3,1]
 * <strong>输出:</strong> 12
 * <strong>解释:</strong> 偷窃 1 号房屋 (金额 = 2), 偷窃 3 号房屋 (金额 = 9)，接着偷窃 5 号房屋 (金额 = 1)。
 * &nbsp;    偷窃到的最高金额 = 2 + 9 + 1 = 12 。
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>maximum-product-subarray</li>
 *   <li>house-robber-ii</li>
 *   <li>paint-house</li>
 *   <li>paint-fence</li>
 *   <li>house-robber-iii</li>
 *   <li>non-negative-integers-without-consecutive-ones</li>
 *   <li>coin-path</li>
 *   <li>delete-and-earn</li>
 * </ul>
 */
@Problem(
    id = 198,
    name = "house-robber",
    difficulty = Difficulty.EASY,
    tags = {Tag.DYNAMIC_PROGRAMMING}
)
public class HouseRobber {

    /**
     * stem:[a_n="max"(a_(n-2),a_(n-3))+"nums"[n]]
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return nums[0];
        }
        int[] result = new int[n];
        result[0] = nums[0];
        result[1] = nums[1];
        if (n > 2) {
            result[2] = nums[0] + nums[2];
            for (int i = 3; i < n; i++) {
                result[i] = Math.max(result[i - 2], result[i - 3]) + nums[i];
            }
        }
        return Math.max(result[n - 1], result[n - 2]);
    }
}
