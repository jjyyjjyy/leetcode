package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/maximum-subarray/">最大子序和</a>
 *
 * <p>给定一个整数数组 <code>nums</code>&nbsp;，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre><strong>输入:</strong> [-2,1,-3,4,-1,2,1,-5,4],
 * <strong>输出:</strong> 6
 * <strong>解释:</strong>&nbsp;连续子数组&nbsp;[4,-1,2,1] 的和最大，为&nbsp;6。
 * </pre>
 *
 * <p><strong>进阶:</strong></p>
 *
 * <p>如果你已经实现复杂度为 O(<em>n</em>) 的解法，尝试使用更为精妙的分治法求解。</p>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>best-time-to-buy-and-sell-stock</li>
 *   <li>maximum-product-subarray</li>
 *   <li>degree-of-an-array</li>
 *   <li>longest-turbulent-subarray</li>
 * </ul>
 */
@Problem(
    id = 53,
    name = "maximum-subarray",
    difficulty = Difficulty.EASY,
    tags = {Tag.ARRAY, Tag.DIVIDE_AND_CONQUER, Tag.DYNAMIC_PROGRAMMING}
)
public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        return 0;
    }
}
