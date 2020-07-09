package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
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

    /**
     * Kadane算法
     * 维护两个变量 maxToCurrent和max.
     * 依次遍历数组, maxToCurrent等于nums[i]和maxToCurrent+nums[i]的最大值, max等于maxToCurrent和max的最大值.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public int maxSubArray(int[] nums) {
        int maxToCurrent = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxToCurrent = Math.max(maxToCurrent + nums[i], nums[i]);
            max = Math.max(maxToCurrent, max);
        }
        return max;
    }

    /**
     * 分治法
     * 分别找到左右两侧的最大和, 然后和中间包括mid和mid+1的最大和比较.
     * 中间和的计算: 从mid向左找到左边最大和, 从mid+1向右找到最大和, 中间最大和即左边最大和加上右边最大和.
     */
    @Complexity(Complexity.ComplexityType.O_LOG_N)
    public int maxSubArray2(int[] nums) {
        return maxSubArray2Internal(nums, 0, nums.length - 1);
    }

    private int maxSubArray2Internal(int[] nums, int left, int right) {
        if (left == right) {
            return nums[left];
        }

        int mid = (right + left) / 2;

        int leftMax = maxSubArray2Internal(nums, left, mid);
        int rightMax = maxSubArray2Internal(nums, mid + 1, right);

        int leftCrossMax = Integer.MIN_VALUE;
        int lefCrossSum = 0;
        for (int i = mid; i >= left; i--) {
            lefCrossSum += nums[i];
            leftCrossMax = Math.max(lefCrossSum, leftCrossMax);
        }

        int rightCrossMax = nums[mid + 1];
        int rightCrossSum = 0;
        for (int i = mid + 1; i <= right; i++) {
            rightCrossSum += nums[i];
            rightCrossMax = Math.max(rightCrossSum, rightCrossMax);
        }

        int midMax = leftCrossMax + rightCrossMax;

        return Math.max(midMax, Math.max(leftMax, rightMax));
    }
}
