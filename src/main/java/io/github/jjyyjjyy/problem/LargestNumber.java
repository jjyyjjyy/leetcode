package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.Arrays;

/**
 * <a href="https://leetcode-cn.com/problems/largest-number/">最大数</a>
 *
 * <p>给定一组非负整数，重新排列它们的顺序使之组成一个最大的整数。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong> <code>[10,2]</code>
 * <strong>输出:</strong> <code>210</code></pre>
 *
 * <p><strong>示例&nbsp;2:</strong></p>
 *
 * <pre><strong>输入:</strong> <code>[3,30,34,5,9]</code>
 * <strong>输出:</strong> <code>9534330</code></pre>
 *
 * <p><strong>说明: </strong>输出结果可能非常大，所以你需要返回一个字符串而不是整数。</p>
 */
@Problem(
    id = 179,
    name = "largest-number",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.SORT}
)
public class LargestNumber {

    /**
     * 将数字按照字符串两两组合的顺序排序, 然后删除前导0.
     */
    @Complexity(Complexity.ComplexityType.O_N_LOG_N)
    public String largestNumber(int[] nums) {
        String[] result = Arrays.stream(nums)
            .mapToObj(String::valueOf)
            .sorted((a, b) -> (b + a).compareTo(a + b))
            .toArray(String[]::new);
        if (result.length > 0 && "0".equals(result[0])) {
            return "0";
        }
        return String.join("", result);
    }
}
