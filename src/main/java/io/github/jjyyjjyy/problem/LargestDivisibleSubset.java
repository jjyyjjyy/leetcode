package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <a href="https://leetcode-cn.com/problems/largest-divisible-subset/">最大整除子集</a>
 *
 * <p>给出一个由<strong>无重复的</strong>正整数组成的集合，找出其中最大的整除子集，子集中任意一对 (S<sub>i，</sub>S<sub>j</sub>) 都要满足：S<sub>i</sub> % S<sub>j</sub> = 0 或 S<sub>j</sub> % S<sub>i</sub> = 0。</p>
 *
 * <p>如果有多个目标子集，返回其中任何一个均可。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong> [1,2,3]
 * <strong>输出:</strong> [1,2] (当然, [1,3] 也正确)
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre><strong>输入:</strong> [1,2,4,8]
 * <strong>输出:</strong> [1,2,4,8]
 * </pre>
 */
@Problem(
    id = 368,
    name = "largest-divisible-subset",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.MATH, Tag.DYNAMIC_PROGRAMMING}
)
public class LargestDivisibleSubset {

    /**
     * 1. 将数组排好序.
     * 2. 维护一个dp数组, 存储当前元素可以整除右侧元素的数.
     * 3. 依次遍历数组, 判断当前元素能不能整除后面的数, 如果可以, 加1. 同时维护dp数组里的最大值, 和该dp值对应的数组元素.
     * 4. 从后向前遍历数组, 如果当前数可以被最大数整除, 则加入到结果集中, 更新最大的值为当前元素.
     */
    @Complexity(Complexity.ComplexityType.O_N_POW_2)
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        int maxSize = 1;
        int maxVal = dp[0];

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            if (dp[i] > maxSize) {
                maxSize = dp[i];
                maxVal = nums[i];
            }
        }
        if (maxSize == 1) {
            return Collections.singletonList(nums[0]);
        }
        List<Integer> result = new ArrayList<>();

        for (int i = n - 1; i >= 0 && maxSize > 0; i--) {
            if (dp[i] == maxSize && maxVal % nums[i] == 0) {
                result.add(nums[i]);
                maxVal = nums[i];
                maxSize--;
            }
        }
        return result;
    }
}
