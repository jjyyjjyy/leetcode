package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <a href="https://leetcode-cn.com/problems/summary-ranges/">汇总区间</a>
 *
 * <p>给定一个无重复元素的有序整数数组，返回数组区间范围的汇总。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong> [0,1,2,4,5,7]
 * <strong>输出:</strong> [&quot;0-&gt;2&quot;,&quot;4-&gt;5&quot;,&quot;7&quot;]
 * <strong>解释: </strong>0,1,2 可组成一个连续的区间;&nbsp;4,5 可组成一个连续的区间。</pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre><strong>输入:</strong> [0,2,3,4,6,8,9]
 * <strong>输出:</strong> [&quot;0&quot;,&quot;2-&gt;4&quot;,&quot;6&quot;,&quot;8-&gt;9&quot;]
 * <strong>解释: </strong>2,3,4 可组成一个连续的区间;&nbsp;8,9 可组成一个连续的区间。</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>missing-ranges</li>
 *   <li>data-stream-as-disjoint-intervals</li>
 * </ul>
 */
@Problem(
    id = 228,
    name = "summary-ranges",
    difficulty = Difficulty.EASY,
    tags = {Tag.ARRAY}
)
public class SummaryRanges {

    /**
     * 1. 依次遍历, 判断当前值与数组下一个值是否相差1.
     * 1.1. 如果相差1, 则继续循环.
     * 1.2. 如果与上次记录的区间起始值相同, 则该值加入到结果集里.
     * 1.3. 如果不同, 则将记录的区间起始值和当前值拼接, 加入到结果集里.
     * 2. 记录下一位的值为区间起始值.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public List<String> summaryRanges(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return Collections.emptyList();
        }
        List<String> result = new ArrayList<>();
        int prev = nums[0];
        for (int i = 0; i < n; i++) {
            if (i < n - 1 && nums[i + 1] - nums[i] == 1) {
                continue;
            }
            if (nums[i] == prev) {
                result.add(String.valueOf(prev));
            } else {
                result.add(prev + "->" + nums[i]);
            }
            if (i < n - 1) {
                prev = nums[i + 1];
            }
        }
        return result;
    }
}
