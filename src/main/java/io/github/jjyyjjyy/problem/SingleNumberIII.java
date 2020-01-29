package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/single-number-iii/">只出现一次的数字 III</a>
 *
 * <p>给定一个整数数组&nbsp;<code>nums</code>，其中恰好有两个元素只出现一次，其余所有元素均出现两次。 找出只出现一次的那两个元素。</p>
 *
 * <p><strong>示例 :</strong></p>
 *
 * <pre><strong>输入:</strong> <code>[1,2,1,3,2,5]</code>
 * <strong>输出:</strong> <code>[3,5]</code></pre>
 *
 * <p><strong>注意：</strong></p>
 *
 * <ol>
 * 	<li>结果输出的顺序并不重要，对于上面的例子，&nbsp;<code>[5, 3]</code>&nbsp;也是正确答案。</li>
 * 	<li>你的算法应该具有线性时间复杂度。你能否仅使用常数空间复杂度来实现？</li>
 * </ol>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>single-number</li>
 *   <li>single-number-ii</li>
 * </ul>
 */
@Problem(
    id = 260,
    name = "single-number-iii",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.BIT_MANIPULATION}
)
public class SingleNumberIII {
}
