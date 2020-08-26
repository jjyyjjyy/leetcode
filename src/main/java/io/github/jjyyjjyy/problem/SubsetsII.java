package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <a href="https://leetcode-cn.com/problems/subsets-ii/">子集 II</a>
 *
 * <p>给定一个可能包含重复元素的整数数组 <em><strong>nums</strong></em>，返回该数组所有可能的子集（幂集）。</p>
 *
 * <p><strong>说明：</strong>解集不能包含重复的子集。</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre><strong>输入:</strong> [1,2,2]
 * <strong>输出:</strong>
 * [
 *   [2],
 *   [1],
 *   [1,2,2],
 *   [2,2],
 *   [1,2],
 *   []
 * ]</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>subsets</li>
 * </ul>
 */
@Problem(
    id = 90,
    name = "subsets-ii",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.ARRAY, Tag.BACKTRACKING}
)
public class SubsetsII {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        subsetsWithDup(new ArrayList<>(), result, nums, 0);
        return result;
    }

    private void subsetsWithDup(List<Integer> done, List<List<Integer>> result, int[] nums, int i) {
        result.add(new ArrayList<>(done));
        for (int j = i; j < nums.length; j++) {
            if (j > i && nums[j] == nums[j - 1]) {
                continue;
            }
            done.add(nums[j]);
            subsetsWithDup(done, result, nums, j + 1);
            done.remove(done.size() - 1);
        }
    }
}
