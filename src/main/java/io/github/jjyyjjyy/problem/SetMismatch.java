package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode-cn.com/problems/set-mismatch/">错误的集合</a>
 *
 * <p>集合 <code>S</code> 包含从1到&nbsp;<code>n</code>&nbsp;的整数。不幸的是，因为数据错误，导致集合里面某一个元素复制了成了集合里面的另外一个元素的值，导致集合丢失了一个整数并且有一个元素重复。</p>
 *
 * <p>给定一个数组 <code>nums</code> 代表了集合 <code>S</code> 发生错误后的结果。你的任务是首先寻找到重复出现的整数，再找到丢失的整数，将它们以数组的形式返回。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> nums = [1,2,2,4]
 * <strong>输出:</strong> [2,3]
 * </pre>
 *
 * <p><strong>注意:</strong></p>
 *
 * <ol>
 * 	<li>给定数组的长度范围是&nbsp;[2, 10000]。</li>
 * 	<li>给定的数组是无序的。</li>
 * </ol>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>find-the-duplicate-number</li>
 * </ul>
 */
@Problem(
    id = 645,
    name = "set-mismatch",
    difficulty = Difficulty.EASY,
    tags = {Tag.HASH_TABLE, Tag.MATH}
)
public class SetMismatch {

    /**
     * 1. 计算当前数组的和sum.
     * 2. 计算当前数组去重后的和distinctSum.
     * 3. 重复的次数等于sum-distinctSum.
     * 4. 丢失的次数等于n*(n+1)/2-distinctSum.
     */
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int sum = Arrays.stream(nums).sum();
        int distinctSum = Arrays.stream(nums).distinct().sum();
        return new int[]{sum - distinctSum, n * (n + 1) / 2 - distinctSum};
    }

    /**
     * 使用哈希表计算每个次数出现的次数, 1到n中出现次数为0的即为丢失的数字, 出现次数为2的即为重复的数字.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public int[] findErrorNums2(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }
        int[] result = new int[2];
        for (int i = 1; i <= nums.length; i++) {
            if (counts.get(i) == null) {
                result[1] = i;
            } else if (counts.get(i) == 2) {
                result[0] = i;
            }
        }
        return result;
    }
}
