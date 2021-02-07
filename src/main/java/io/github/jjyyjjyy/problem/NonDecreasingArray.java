package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/non-decreasing-array/">非递减数列</a>
 *
 * <p>给定一个长度为&nbsp;<code>n</code>&nbsp;的整数数组，你的任务是判断在<strong>最多</strong>改变&nbsp;<code>1</code> 个元素的情况下，该数组能否变成一个非递减数列。</p>
 *
 * <p>我们是这样定义一个非递减数列的：&nbsp;对于数组中所有的&nbsp;<code>i</code> (1 &lt;= i &lt; n)，满足&nbsp;<code>array[i] &lt;= array[i + 1]</code>。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> [4,2,3]
 * <strong>输出:</strong> True
 * <strong>解释:</strong> 你可以通过把第一个4变成1来使得它成为一个非递减数列。
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> [4,2,1]
 * <strong>输出:</strong> False
 * <strong>解释:</strong> 你不能在只改变一个元素的情况下将其变为非递减数列。
 * </pre>
 *
 * <p><strong>说明:&nbsp;&nbsp;</strong><code>n</code> 的范围为 [1, 10,000]。</p>
 */
@Problem(
    id = 665,
    name = "non-decreasing-array",
    difficulty = Difficulty.EASY,
    tags = {Tag.ARRAY}
)
public class NonDecreasingArray {

    /**
     * 1. 维护一个最大次数变量, 依次遍历数组.
     * 1.1. 如果当前元素比下一个元素大, 则次数减一, 次数小于0则超出最大替换次数, 返回false.
     * 1.2. 如果当前位置的左边元素比当前位置的右边元素大, 则要将右边元素替换成当前元素.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public boolean checkPossibility(int[] nums) {
        int times = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                times--;
                if (times < 0) {
                    return false;
                }
                if (i > 0 && nums[i - 1] > nums[i + 1]) {
                    nums[i + 1] = nums[i];
                }
            }
        }
        return true;
    }
}
