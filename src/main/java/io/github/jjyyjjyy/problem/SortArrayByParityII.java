package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/sort-array-by-parity-ii/">按奇偶排序数组 II</a>
 *
 * <p>给定一个非负整数数组&nbsp;<code>A</code>， A 中一半整数是奇数，一半整数是偶数。</p>
 *
 * <p>对数组进行排序，以便当&nbsp;<code>A[i]</code> 为奇数时，<code>i</code>&nbsp;也是奇数；当&nbsp;<code>A[i]</code>&nbsp;为偶数时， <code>i</code> 也是偶数。</p>
 *
 * <p>你可以返回任何满足上述条件的数组作为答案。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例：</strong></p>
 *
 * <pre><strong>输入：</strong>[4,2,5,7]
 * <strong>输出：</strong>[4,5,2,7]
 * <strong>解释：</strong>[4,7,2,5]，[2,5,4,7]，[2,7,4,5] 也会被接受。
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ol>
 * 	<li><code>2 &lt;= A.length &lt;= 20000</code></li>
 * 	<li><code>A.length % 2 == 0</code></li>
 * 	<li><code>0 &lt;= A[i] &lt;= 1000</code></li>
 * </ol>
 *
 * <p>&nbsp;</p>
 */
@Problem(
    id = 958,
    name = "sort-array-by-parity-ii",
    difficulty = Difficulty.EASY,
    tags = {Tag.SORT, Tag.ARRAY}
)
public class SortArrayByParityII {
}
