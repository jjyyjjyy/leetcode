package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <a href="https://leetcode-cn.com/problems/combination-sum-ii/">组合总和 II</a>
 *
 * <p>给定一个数组&nbsp;<code>candidates</code>&nbsp;和一个目标数&nbsp;<code>target</code>&nbsp;，找出&nbsp;<code>candidates</code>&nbsp;中所有可以使数字和为&nbsp;<code>target</code>&nbsp;的组合。</p>
 *
 * <p><code>candidates</code>&nbsp;中的每个数字在每个组合中只能使用一次。</p>
 *
 * <p><strong>说明：</strong></p>
 *
 * <ul>
 * 	<li>所有数字（包括目标数）都是正整数。</li>
 * 	<li>解集不能包含重复的组合。&nbsp;</li>
 * </ul>
 *
 * <p><strong>示例&nbsp;1:</strong></p>
 *
 * <pre><strong>输入:</strong> candidates =&nbsp;<code>[10,1,2,7,6,1,5]</code>, target =&nbsp;<code>8</code>,
 * <strong>所求解集为:</strong>
 * [
 *   [1, 7],
 *   [1, 2, 5],
 *   [2, 6],
 *   [1, 1, 6]
 * ]
 * </pre>
 *
 * <p><strong>示例&nbsp;2:</strong></p>
 *
 * <pre><strong>输入:</strong> candidates =&nbsp;[2,5,2,1,2], target =&nbsp;5,
 * <strong>所求解集为:</strong>
 * [
 * &nbsp; [1,2,2],
 * &nbsp; [5]
 * ]</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>combination-sum</li>
 * </ul>
 */
@Problem(
    id = 40,
    name = "combination-sum-ii",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.ARRAY, Tag.BACKTRACKING}
)
public class CombinationSumII {

    private List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        combinationSum2(candidates, target, new ArrayList<>(), 0);
        return result;
    }

    private void combinationSum2(int[] candidates, int target, List<Integer> list, int i) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            result.add(new ArrayList<>(list));
            return;
        }
        for (int j = i; j < candidates.length && candidates[j] <= target; j++) {
            if (j > i && candidates[j] == candidates[j - 1]) {
                continue;
            }
            int candidate = candidates[j];
            list.add(candidate);
            combinationSum2(candidates, target - candidate, list, j + 1);
            list.remove(list.size() - 1);
        }
    }
}
