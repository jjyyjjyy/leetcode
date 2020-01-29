package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/element-appearing-more-than-25-in-sorted-array/">有序数组中出现次数超过25%的元素</a>
 *
 * <p>给你一个非递减的&nbsp;<strong>有序&nbsp;</strong>整数数组，已知这个数组中恰好有一个整数，它的出现次数超过数组元素总数的 25%。</p>
 *
 * <p>请你找到并返回这个整数</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>arr = [1,2,2,6,6,6,6,7,10]
 * <strong>输出：</strong>6
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * 	<li><code>1 &lt;= arr.length &lt;= 10^4</code></li>
 * 	<li><code>0 &lt;= arr[i] &lt;= 10^5</code></li>
 * </ul>
 */
@Problem(
    id = 1221,
    name = "element-appearing-more-than-25-in-sorted-array",
    difficulty = Difficulty.EASY,
    tags = {Tag.ARRAY}
)
public class ElementAppearingMoreThan25InSortedArray {
}
