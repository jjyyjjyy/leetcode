package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * <a href="https://leetcode-cn.com/problems/permutations/">全排列</a>
 *
 * <p>给定一个<strong>没有重复</strong>数字的序列，返回其所有可能的全排列。</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre><strong>输入:</strong> [1,2,3]
 * <strong>输出:</strong>
 * [
 *   [1,2,3],
 *   [1,3,2],
 *   [2,1,3],
 *   [2,3,1],
 *   [3,1,2],
 *   [3,2,1]
 * ]</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>next-permutation</li>
 *   <li>permutations-ii</li>
 *   <li>permutation-sequence</li>
 *   <li>combinations</li>
 * </ul>
 */
@Problem(
    id = 46,
    name = "permutations",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.BACKTRACKING}
)
public class Permutations {

    /**
     * 依次遍历数组, 将当前位置之前的数加上后面元素的全排列加入到结果集中.
     */
    @Complexity(value = Complexity.ComplexityType.O_DEFINE, complexity = "O(n*n!)")
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backTrack(result, nums, 0);
        return result;
    }

    private void backTrack(List<List<Integer>> result, int[] nums, int current) {
        if (current == nums.length) {
            result.add(IntStream.of(nums).boxed().collect(Collectors.toList()));
        }
        for (int i = current; i < nums.length; i++) {
            exchange(nums, current, i);
            backTrack(result, nums, current + 1);
            exchange(nums, current, i);
        }
    }

    private void exchange(int[] nums, int a, int b) {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }

}
