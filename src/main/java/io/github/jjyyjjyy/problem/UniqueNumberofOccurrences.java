package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/unique-number-of-occurrences/">独一无二的出现次数</a>
 *
 * <p>给你一个整数数组&nbsp;<code>arr</code>，请你帮忙统计数组中每个数的出现次数。</p>
 *
 * <p>如果每个数的出现次数都是独一无二的，就返回&nbsp;<code>true</code>；否则返回 <code>false</code>。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><strong>输入：</strong>arr = [1,2,2,1,1,3]
 * <strong>输出：</strong>true
 * <strong>解释：</strong>在该数组中，1 出现了 3 次，2 出现了 2 次，3 只出现了 1 次。没有两个数的出现次数相同。</pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre><strong>输入：</strong>arr = [1,2]
 * <strong>输出：</strong>false
 * </pre>
 *
 * <p><strong>示例 3：</strong></p>
 *
 * <pre><strong>输入：</strong>arr = [-3,0,1,-3,1,1,1,-3,10,0]
 * <strong>输出：</strong>true
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * 	<li><code>1 &lt;= arr.length&nbsp;&lt;= 1000</code></li>
 * 	<li><code>-1000 &lt;= arr[i] &lt;= 1000</code></li>
 * </ul>
 */
@Problem(
    id = 1319,
    name = "unique-number-of-occurrences",
    difficulty = Difficulty.EASY,
    tags = {Tag.HASH_TABLE}
)
public class UniqueNumberofOccurrences {
}
