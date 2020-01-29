package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/squares-of-a-sorted-array/">有序数组的平方</a>
 *
 * <p>给定一个按非递减顺序排序的整数数组 <code>A</code>，返回每个数字的平方组成的新数组，要求也按非递减顺序排序。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><strong>输入：</strong>[-4,-1,0,3,10]
 * <strong>输出：</strong>[0,1,9,16,100]
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre><strong>输入：</strong>[-7,-3,2,3,11]
 * <strong>输出：</strong>[4,9,9,49,121]
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ol>
 * 	<li><code>1 &lt;= A.length &lt;= 10000</code></li>
 * 	<li><code>-10000 &lt;= A[i] &lt;= 10000</code></li>
 * 	<li><code>A</code>&nbsp;已按非递减顺序排序。</li>
 * </ol>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>merge-sorted-array</li>
 *   <li>sort-transformed-array</li>
 * </ul>
 */
@Problem(
    id = 1019,
    name = "squares-of-a-sorted-array",
    difficulty = Difficulty.EASY,
    tags = {Tag.ARRAY, Tag.TWO_POINTERS}
)
public class SquaresofaSortedArray {
}
