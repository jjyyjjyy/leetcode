package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.stream.IntStream;

/**
 * <a href="https://leetcode-cn.com/problems/delete-and-earn/">删除与获得点数</a>
 *
 * <p>给定一个整数数组&nbsp;<code>nums</code>&nbsp;，你可以对它进行一些操作。</p>
 *
 * <p>每次操作中，选择任意一个&nbsp;<code>nums[i]</code>&nbsp;，删除它并获得&nbsp;<code>nums[i]</code>&nbsp;的点数。之后，你必须删除<strong>每个</strong>等于&nbsp;<code>nums[i] - 1</code>&nbsp;或&nbsp;<code>nums[i] + 1</code>&nbsp;的元素。</p>
 *
 * <p>开始你拥有 0 个点数。返回你能通过这些操作获得的最大点数。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> nums = [3, 4, 2]
 * <strong>输出:</strong> 6
 * <strong>解释:</strong>
 * 删除 4 来获得 4 个点数，因此 3 也被删除。
 * 之后，删除 2 来获得 2 个点数。总共获得 6 个点数。
 * </pre>
 *
 * <p><strong>示例&nbsp;2:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> nums = [2, 2, 3, 3, 3, 4]
 * <strong>输出:</strong> 9
 * <strong>解释:</strong>
 * 删除 3 来获得 3 个点数，接着要删除两个 2 和 4 。
 * 之后，再次删除 3 获得 3 个点数，再次删除 3 获得 3 个点数。
 * 总共获得 9 个点数。
 * </pre>
 *
 * <p><strong>注意:</strong></p>
 *
 * <ul>
 * 	<li><code>nums</code>的长度最大为<code>20000</code>。</li>
 * 	<li>每个整数<code>nums[i]</code>的大小都在<code>[1, 10000]</code>范围内。</li>
 * </ul>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>house-robber</li>
 * </ul>
 */
@Problem(
    id = 740,
    name = "delete-and-earn",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.DYNAMIC_PROGRAMMING}
)
public class DeleteAndEarn {

    /**
     * 1. 创建一个dp数组, 保存每个位置元素的总和.
     * 2. 依次遍历dp数组, 将n-2位置的结果加上当前元素的和与n-1位置的结果作比较取较大值.
     */
    @Complexity(Complexity.ComplexityType.O_M_AND_N)
    public int deleteAndEarn(int[] nums) {
        int max = IntStream.of(nums).max().getAsInt();
        int[] dp = new int[max + 1];
        for (int num : nums) {
            dp[num] += num;
        }
        return rob(dp);
    }

    private int rob(int[] dp) {
        int n = dp.length;
        int first = dp[0];
        int second = Math.max(dp[0], dp[1]);
        for (int i = 2; i < n; i++) {
            int tmp = second;
            second = Math.max(first + dp[i], second);
            first = tmp;
        }
        return second;
    }
}
