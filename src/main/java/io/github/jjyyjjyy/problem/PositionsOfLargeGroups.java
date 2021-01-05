package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <a href="https://leetcode-cn.com/problems/positions-of-large-groups/">较大分组的位置</a>
 *
 * <p>在一个由小写字母构成的字符串&nbsp;<code>S</code>&nbsp;中，包含由一些连续的相同字符所构成的分组。</p>
 *
 * <p>例如，在字符串 <code>S = &quot;abbxxxxzyy&quot;</code>&nbsp;中，就含有 <code>&quot;a&quot;</code>, <code>&quot;bb&quot;</code>, <code>&quot;xxxx&quot;</code>, <code>&quot;z&quot;</code> 和 <code>&quot;yy&quot;</code> 这样的一些分组。</p>
 *
 * <p>我们称所有包含大于或等于三个连续字符的分组为较大分组。找到每一个较大分组的起始和终止位置。</p>
 *
 * <p>最终结果按照字典顺序输出。</p>
 *
 * <p><strong>示例&nbsp;1:</strong></p>
 *
 * <pre>
 * <strong>输入: </strong>&quot;abbxxxxzzy&quot;
 * <strong>输出: </strong>[[3,6]]
 * <strong>解释</strong>: <code>&quot;xxxx&quot; 是一个起始于 3 且终止于 6 的较大分组</code>。
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre>
 * <strong>输入: </strong>&quot;abc&quot;
 * <strong>输出: </strong>[]
 * <strong>解释</strong>: &quot;a&quot;,&quot;b&quot; 和 &quot;c&quot; 均不是符合要求的较大分组。
 * </pre>
 *
 * <p><strong>示例 3:</strong></p>
 *
 * <pre>
 * <strong>输入: </strong>&quot;abcdddeeeeaabbbcd&quot;
 * <strong>输出: </strong>[[3,5],[6,9],[12,14]]</pre>
 *
 * <p><strong>说明:&nbsp;</strong>&nbsp;<code>1 &lt;= S.length &lt;= 1000</code></p>
 */
@Problem(
    id = 857,
    name = "positions-of-large-groups",
    difficulty = Difficulty.EASY,
    tags = {Tag.ARRAY}
)
public class PositionsOfLargeGroups {

    /**
     * 1. 维护重复字符子串的起始位置.
     * 2. 依次遍历数组, 判断当前值是否与起始位置是否相等
     * 2.1. 如果不相等则判断当前位置与起始位置是否相差大于3, 则加入到结果集中, 将起始位置改成当前位置.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> result = new ArrayList<>();

        int start = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(start)) {
                if (i - start >= 3) {
                    result.add(Arrays.asList(start, i - 1));
                }
                start = i;
            }
        }

        if (start <= s.length() - 3) {
            result.add(Arrays.asList(start, s.length() - 1));
        }

        return result;
    }
}
