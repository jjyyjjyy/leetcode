package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

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
}
