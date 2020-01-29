package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/3sum/">三数之和</a>
 *
 * <p>给定一个包含 <em>n</em> 个整数的数组&nbsp;<code>nums</code>，判断&nbsp;<code>nums</code>&nbsp;中是否存在三个元素 <em>a，b，c ，</em>使得&nbsp;<em>a + b + c = </em>0 ？找出所有满足条件且不重复的三元组。</p>
 *
 * <p><strong>注意：</strong>答案中不可以包含重复的三元组。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例：</strong></p>
 *
 * <pre>给定数组 nums = [-1, 0, 1, 2, -1, -4]，
 *
 * 满足要求的三元组集合为：
 * [
 *   [-1, 0, 1],
 *   [-1, -1, 2]
 * ]
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>two-sum</li>
 *   <li>3sum-closest</li>
 *   <li>4sum</li>
 *   <li>3sum-smaller</li>
 * </ul>
 */
@Problem(
    id = 15,
    name = "3sum",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.ARRAY, Tag.TWO_POINTERS}
)
public class ThreeSum {
}
