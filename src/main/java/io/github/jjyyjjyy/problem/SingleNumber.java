package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/single-number/">只出现一次的数字</a>
 *
 * <p>给定一个<strong>非空</strong>整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。</p>
 *
 * <p><strong>说明：</strong></p>
 *
 * <p>你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong> [2,2,1]
 * <strong>输出:</strong> 1
 * </pre>
 *
 * <p><strong>示例&nbsp;2:</strong></p>
 *
 * <pre><strong>输入:</strong> [4,1,2,1,2]
 * <strong>输出:</strong> 4</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>single-number-ii</li>
 *   <li>single-number-iii</li>
 *   <li>missing-number</li>
 *   <li>find-the-duplicate-number</li>
 *   <li>find-the-difference</li>
 * </ul>
 */
@Problem(
    id = 136,
    name = "single-number",
    difficulty = Difficulty.EASY,
    tags = {Tag.BIT_MANIPULATION, Tag.HASH_TABLE}
)
public class SingleNumber {
}
