package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/missing-number/">缺失数字</a>
 *
 * <p>给定一个包含 <code>0, 1, 2, ..., n</code>&nbsp;中&nbsp;<em>n</em>&nbsp;个数的序列，找出 0 .. <em>n</em>&nbsp;中没有出现在序列中的那个数。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong> [3,0,1]
 * <strong>输出:</strong> 2
 * </pre>
 *
 * <p><strong>示例&nbsp;2:</strong></p>
 *
 * <pre><strong>输入:</strong> [9,6,4,2,3,5,7,0,1]
 * <strong>输出:</strong> 8
 * </pre>
 *
 * <p><strong>说明:</strong><br>
 * 你的算法应具有线性时间复杂度。你能否仅使用额外常数空间来实现?</p>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>first-missing-positive</li>
 *   <li>single-number</li>
 *   <li>find-the-duplicate-number</li>
 *   <li>couples-holding-hands</li>
 * </ul>
 */
@Problem(
    id = 268,
    name = "missing-number",
    difficulty = Difficulty.EASY,
    tags = {Tag.BIT_MANIPULATION, Tag.ARRAY, Tag.MATH}
)
public class MissingNumber {

    /**
     * 对数组每个元素和下标异或操作, 最后异或数组长度值, 得到缺失的值.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public int missingNumber(int[] nums) {
        int result = nums.length;
        for (int i = 0; i < nums.length; i++) {
            result ^= i ^ nums[i];
        }
        return result;
    }

    /**
     * 先用高斯公式求出序列期望的总和, 然后依次减去数组元素, 最后得到缺失的值.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public int missingNumber2(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2;
        for (int num : nums) {
            sum -= num;
        }
        return sum;
    }
}
