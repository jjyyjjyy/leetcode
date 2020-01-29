package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/random-pick-index/">随机数索引</a>
 *
 * <p>给定一个可能含有重复元素的整数数组，要求随机输出给定的数字的索引。 您可以假设给定的数字一定存在于数组中。</p>
 *
 * <p><strong>注意：</strong><br />
 * 数组大小可能非常大。 使用太多额外空间的解决方案将不会通过测试。</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre>
 * int[] nums = new int[] {1,2,3,3,3};
 * Solution solution = new Solution(nums);
 *
 * // pick(3) 应该返回索引 2,3 或者 4。每个索引的返回概率应该相等。
 * solution.pick(3);
 *
 * // pick(1) 应该返回 0。因为只有nums[0]等于1。
 * solution.pick(1);
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>linked-list-random-node</li>
 *   <li>random-pick-with-blacklist</li>
 *   <li>random-pick-with-weight</li>
 * </ul>
 */
@Problem(
    id = 398,
    name = "random-pick-index",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.RESERVOIR_SAMPLING}
)
public class RandomPickIndex {
}
