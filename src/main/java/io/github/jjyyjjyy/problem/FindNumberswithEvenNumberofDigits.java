package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/find-numbers-with-even-number-of-digits/">统计位数为偶数的数字</a>
 *
 * <p>给你一个整数数组&nbsp;<code>nums</code>，请你返回其中位数为&nbsp;<strong>偶数</strong>&nbsp;的数字的个数。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><strong>输入：</strong>nums = [12,345,2,6,7896]
 * <strong>输出：</strong>2
 * <strong>解释：
 * </strong>12 是 2 位数字（位数为偶数）&nbsp;
 * 345 是 3 位数字（位数为奇数）&nbsp;&nbsp;
 * 2 是 1 位数字（位数为奇数）&nbsp;
 * 6 是 1 位数字 位数为奇数）&nbsp;
 * 7896 是 4 位数字（位数为偶数）&nbsp;&nbsp;
 * 因此只有 12 和 7896 是位数为偶数的数字
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre><strong>输入：</strong>nums = [555,901,482,1771]
 * <strong>输出：</strong>1
 * <strong>解释： </strong>
 * 只有 1771 是位数为偶数的数字。
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * 	<li><code>1 &lt;= nums.length &lt;= 500</code></li>
 * 	<li><code>1 &lt;= nums[i] &lt;= 10^5</code></li>
 * </ul>
 */
@Problem(
    id = 1421,
    name = "find-numbers-with-even-number-of-digits",
    difficulty = Difficulty.EASY,
    tags = {Tag.ARRAY}
)
public class FindNumberswithEvenNumberofDigits {
}
