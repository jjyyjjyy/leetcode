package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.Collections;
import java.util.List;

/**
 * <a href="https://leetcode-cn.com/problems/4sum/">四数之和</a>
 *
 * <p>给定一个包含&nbsp;<em>n</em> 个整数的数组&nbsp;<code>nums</code>&nbsp;和一个目标值&nbsp;<code>target</code>，判断&nbsp;<code>nums</code>&nbsp;中是否存在四个元素 <em>a，</em><em>b，c</em>&nbsp;和 <em>d</em>&nbsp;，使得&nbsp;<em>a</em> + <em>b</em> + <em>c</em> + <em>d</em>&nbsp;的值与&nbsp;<code>target</code>&nbsp;相等？找出所有满足条件且不重复的四元组。</p>
 *
 * <p><strong>注意：</strong></p>
 *
 * <p>答案中不可以包含重复的四元组。</p>
 *
 * <p><strong>示例：</strong></p>
 *
 * <pre>给定数组 nums = [1, 0, -1, 0, -2, 2]，和 target = 0。
 *
 * 满足要求的四元组集合为：
 * [
 *   [-1,  0, 0, 1],
 *   [-2, -1, 1, 2],
 *   [-2,  0, 0, 2]
 * ]
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>two-sum</li>
 *   <li>3sum</li>
 *   <li>4sum-ii</li>
 * </ul>
 */
@Problem(
    id = 18,
    name = "4sum",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.ARRAY, Tag.HASH_TABLE, Tag.TWO_POINTERS}
)
public class FourSum {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        return Collections.emptyList();
    }

}
