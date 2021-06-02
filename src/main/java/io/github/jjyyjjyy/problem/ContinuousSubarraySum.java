package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode-cn.com/problems/continuous-subarray-sum/">连续的子数组和</a>
 *
 * <p>给定一个包含<strong>非负数</strong>的数组和一个目标<strong>整数</strong>&nbsp;k，编写一个函数来判断该数组是否含有连续的子数组，其大小至少为 2，总和为 <strong>k</strong> 的倍数，即总和为 n*k，其中 n 也是一个<strong>整数</strong>。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong> [23,2,4,6,7], k = 6
 * <strong>输出:</strong> True
 * <strong>解释:</strong> [2,4] 是一个大小为 2 的子数组，并且和为 6。
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre><strong>输入:</strong> [23,2,6,4,7], k = 6
 * <strong>输出:</strong> True
 * <strong>解释:</strong> [23,2,6,4,7]是大小为 5 的子数组，并且和为 42。
 * </pre>
 *
 * <p><strong>说明:</strong></p>
 *
 * <ol>
 * 	<li>数组的长度不会超过10,000。</li>
 * 	<li>你可以认为所有数字总和在 32 位有符号整数范围内。</li>
 * </ol>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>subarray-sum-equals-k</li>
 * </ul>
 */
@Problem(
    id = 523,
    name = "continuous-subarray-sum",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.MATH, Tag.DYNAMIC_PROGRAMMING}
)
public class ContinuousSubarraySum {

    /**
     * 依次遍历数组, 判断是否之前出现过与当前相同的余数, 如果距离大于2则符合条件
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        if (n < 2) {
            return false;
        }
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int remainder = 0;
        for (int i = 0; i < n; i++) {
            remainder = (remainder + nums[i]) % k;
            if (map.containsKey(remainder)) {
                if (i - map.get(remainder) >= 2) {
                    return true;
                }
            } else {
                map.put(remainder, i);
            }
        }
        return false;
    }
}
