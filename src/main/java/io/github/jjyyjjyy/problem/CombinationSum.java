package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <a href="https://leetcode-cn.com/problems/combination-sum/">组合总和</a>
 *
 * <p>给定一个<strong>无重复元素</strong>的数组&nbsp;<code>candidates</code>&nbsp;和一个目标数&nbsp;<code>target</code>&nbsp;，找出&nbsp;<code>candidates</code>&nbsp;中所有可以使数字和为&nbsp;<code>target</code>&nbsp;的组合。</p>
 *
 * <p><code>candidates</code>&nbsp;中的数字可以无限制重复被选取。</p>
 *
 * <p><strong>说明：</strong></p>
 *
 * <ul>
 * 	<li>所有数字（包括&nbsp;<code>target</code>）都是正整数。</li>
 * 	<li>解集不能包含重复的组合。&nbsp;</li>
 * </ul>
 *
 * <p><strong>示例&nbsp;1:</strong></p>
 *
 * <pre><strong>输入:</strong> candidates = <code>[2,3,6,7], </code>target = <code>7</code>,
 * <strong>所求解集为:</strong>
 * [
 *   [7],
 *   [2,2,3]
 * ]
 * </pre>
 *
 * <p><strong>示例&nbsp;2:</strong></p>
 *
 * <pre><strong>输入:</strong> candidates = [2,3,5]<code>, </code>target = 8,
 * <strong>所求解集为:</strong>
 * [
 * &nbsp; [2,2,2,2],
 * &nbsp; [2,3,3],
 * &nbsp; [3,5]
 * ]</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>letter-combinations-of-a-phone-number</li>
 *   <li>combination-sum-ii</li>
 *   <li>combinations</li>
 *   <li>combination-sum-iii</li>
 *   <li>factor-combinations</li>
 *   <li>combination-sum-iv</li>
 * </ul>
 */
@Problem(
    id = 39,
    name = "combination-sum",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.ARRAY, Tag.BACKTRACKING}
)
public class CombinationSum {

    private final List<List<Integer>> result = new ArrayList<>();

    /**
     * 0. 将数组排下序.
     * 1. 从当前位置向右遍历. 维护一个list, 加入当前元素.
     * 2. 如果target小于0, 则表示后面的元素不需要遍历了, 则结束递归. 如果target=0则表示找到组合, 将list加入到结果集中.
     * 3. target减去当前元素, 得到一个新的target, 重复步骤1.
     * 4. 遍历完后减去list最后一个元素. (因为当前数组已经遍历结束一次, 需要去除最后一个元素来找到其他组合.)
     */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> list = new ArrayList<>();
        combinationSum(candidates, target, list, 0);
        return result;
    }

    private void combinationSum(int[] candidates, int target, List<Integer> list, int i) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            result.add(new ArrayList<>(list));
            return;
        }

        for (int j = i; j < candidates.length && target >= candidates[j]; j++) {
            int candidate = candidates[j];
            list.add(candidate);
            combinationSum(candidates, target - candidate, list, j);
            list.remove(list.size() - 1);
        }
    }

}
