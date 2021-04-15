package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/house-robber-ii/">打家劫舍 II</a>
 *
 * <p>你是一个专业的小偷，计划偷窃沿街的房屋，每间房内都藏有一定的现金。这个地方所有的房屋都<strong>围成一圈，</strong>这意味着第一个房屋和最后一个房屋是紧挨着的。同时，相邻的房屋装有相互连通的防盗系统，<strong>如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警</strong>。</p>
 *
 * <p>给定一个代表每个房屋存放金额的非负整数数组，计算你<strong>在不触动警报装置的情况下，</strong>能够偷窃到的最高金额。</p>
 *
 * <p><strong>示例&nbsp;1:</strong></p>
 *
 * <pre><strong>输入:</strong> [2,3,2]
 * <strong>输出:</strong> 3
 * <strong>解释:</strong> 你不能先偷窃 1 号房屋（金额 = 2），然后偷窃 3 号房屋（金额 = 2）, 因为他们是相邻的。
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre><strong>输入:</strong> [1,2,3,1]
 * <strong>输出:</strong> 4
 * <strong>解释:</strong> 你可以先偷窃 1 号房屋（金额 = 1），然后偷窃 3 号房屋（金额 = 3）。
 * &nbsp;    偷窃到的最高金额 = 1 + 3 = 4 。</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>house-robber</li>
 *   <li>paint-house</li>
 *   <li>paint-fence</li>
 *   <li>house-robber-iii</li>
 *   <li>non-negative-integers-without-consecutive-ones</li>
 *   <li>coin-path</li>
 * </ul>
 */
@Problem(
    id = 213,
    name = "house-robber-ii",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.DYNAMIC_PROGRAMMING}
)
public class HouseRobberII {

    /**
     * 遍历数组, 计算当前抢和不抢两种方法的最大值, 遍历到最后得到能抢到的最大值.
     * 因为不能同时抢首尾, 所以从0~n-2和1~n-1遍历两次得到最大值.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public int rob(int[] nums) {
        if (nums.length < 2) {
            return nums[0];
        }
        return Math.max(rob(nums, 1, nums.length - 1), rob(nums, 0, nums.length - 2));
    }

    public int rob(int[] nums, int start, int end) {
        int nRob = 0;
        int rob = 0;
        for (int i = start; i <= end; i++) {
            int tmp = rob;
            rob = Math.max(nRob + nums[i], rob);
            nRob = tmp;
        }
        return rob;
    }

}
