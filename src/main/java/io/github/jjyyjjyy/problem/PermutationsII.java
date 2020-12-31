package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <a href="https://leetcode-cn.com/problems/permutations-ii/">全排列 II</a>
 *
 * <p>给定一个可包含重复数字的序列，返回所有不重复的全排列。</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre><strong>输入:</strong> [1,1,2]
 * <strong>输出:</strong>
 * [
 *   [1,1,2],
 *   [1,2,1],
 *   [2,1,1]
 * ]</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>next-permutation</li>
 *   <li>permutations</li>
 *   <li>palindrome-permutation-ii</li>
 *   <li>number-of-squareful-arrays</li>
 * </ul>
 */
@Problem(
    id = 47,
    name = "permutations-ii",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.BACKTRACKING}
)
public class PermutationsII {

    @Complexity(value = Complexity.ComplexityType.O_DEFINE, complexity = "O(n*n!)")
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] marks = new boolean[nums.length];
        Arrays.sort(nums);
        backTrack(result, nums, marks, new ArrayList<>(), 0);
        return result;
    }

    private void backTrack(List<List<Integer>> result, int[] nums, boolean[] marks, List<Integer> target, int current) {
        if (current == nums.length) {
            result.add(new ArrayList<>(target));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (marks[i] || i > 0 && nums[i] == nums[i - 1] && !marks[i - 1]) {
                continue;
            }
            target.add(nums[i]);
            marks[i] = true;
            backTrack(result, nums, marks, target, current + 1);
            marks[i] = false;
            target.remove(current);
        }
    }
}
