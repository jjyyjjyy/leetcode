package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/maximum-xor-of-two-numbers-in-an-array/">数组中两个数的最大异或值</a>
 *
 * <p>给定一个非空数组，数组中元素为 a<sub>0</sub>, a<sub>1</sub>, a<sub>2</sub>, &hellip; , a<sub>n-1</sub>，其中 0 &le; a<sub>i</sub> &lt; 2<sup>31&nbsp;</sup>。</p>
 *
 * <p>找到 a<sub>i</sub> 和a<sub>j&nbsp;</sub>最大的异或 (XOR) 运算结果，其中0 &le; <em>i</em>,&nbsp;&nbsp;<em>j</em> &lt; <em>n&nbsp;</em>。</p>
 *
 * <p>你能在O(<em>n</em>)的时间解决这个问题吗？</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> [3, 10, 5, 25, 2, 8]
 *
 * <strong>输出:</strong> 28
 *
 * <strong>解释:</strong> 最大的结果是 <strong>5</strong> ^ <strong>25</strong> = 28.
 * </pre>
 */
@Problem(
    id = 421,
    name = "maximum-xor-of-two-numbers-in-an-array",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.BIT_MANIPULATION, Tag.TRIE}
)
public class MaximumXOROfTwoNumbersInAnArray {

    public int findMaximumXOR(int[] nums) {
        return -1;
    }
}
