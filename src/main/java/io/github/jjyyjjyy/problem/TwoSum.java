package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode-cn.com/problems/two-sum/">两数之和</a>
 *
 * <p>给定一个整数数组 <code>nums</code>&nbsp;和一个目标值 <code>target</code>，请你在该数组中找出和为目标值的那&nbsp;<strong>两个</strong>&nbsp;整数，并返回他们的数组下标。</p>
 *
 * <p>你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre>给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[<strong>0</strong>] + nums[<strong>1</strong>] = 2 + 7 = 9
 * 所以返回 [<strong>0, 1</strong>]
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>3sum</li>
 *   <li>4sum</li>
 *   <li>two-sum-ii-input-array-is-sorted</li>
 *   <li>two-sum-iii-data-structure-design</li>
 *   <li>subarray-sum-equals-k</li>
 *   <li>two-sum-iv-input-is-a-bst</li>
 *   <li>two-sum-less-than-k</li>
 * </ul>
 */
@Problem(
    id = 1,
    name = "two-sum",
    difficulty = Difficulty.EASY,
    tags = {Tag.ARRAY, Tag.HASH_TABLE}
)
public class TwoSum {

    /**
     * 遍历两次数组, 两两相加找到两个元素的索引.
     */
    @Complexity("O(n^2)")
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    /**
     * 使用哈希表存储元素和索引的映射关系.
     * 遍历数组时尝试获取另外一个元素的索引.
     */
    @Complexity("O(n)")
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer idx = map.get(target - nums[i]);
            if (idx != null) {
                return new int[]{idx, i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}
