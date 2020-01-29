package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;

/**
 * <a href="https://leetcode-cn.com/problems/shuffle-an-array/">打乱数组</a>
 *
 * <p>打乱一个没有重复元素的数组。</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre>
 * // 以数字集合 1, 2 和 3 初始化数组。
 * int[] nums = {1,2,3};
 * Solution solution = new Solution(nums);
 *
 * // 打乱数组 [1,2,3] 并返回结果。任何 [1,2,3]的排列返回的概率应该相同。
 * solution.shuffle();
 *
 * // 重设数组到它的初始状态[1,2,3]。
 * solution.reset();
 *
 * // 随机返回数组[1,2,3]打乱后的结果。
 * solution.shuffle();
 * </pre>
 */
@Problem(
    id = 384,
    name = "shuffle-an-array",
    difficulty = Difficulty.MEDIUM,
    tags = {}
)
public class ShuffleanArray {
}
