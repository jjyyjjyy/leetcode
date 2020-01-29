package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/range-sum-query-immutable/">区域和检索 - 数组不可变</a>
 *
 * <p>给定一个整数数组 &nbsp;<em>nums</em>，求出数组从索引&nbsp;<em>i&nbsp;</em>到&nbsp;<em>j&nbsp;&nbsp;</em>(<em>i</em>&nbsp;&le;&nbsp;<em>j</em>) 范围内元素的总和，包含&nbsp;<em>i,&nbsp; j&nbsp;</em>两点。</p>
 *
 * <p><strong>示例：</strong></p>
 *
 * <pre>给定 nums = [-2, 0, 3, -5, 2, -1]，求和函数为 sumRange()
 *
 * sumRange(0, 2) -&gt; 1
 * sumRange(2, 5) -&gt; -1
 * sumRange(0, 5) -&gt; -3</pre>
 *
 * <p><strong>说明:</strong></p>
 *
 * <ol>
 * 	<li>你可以假设数组不可变。</li>
 * 	<li>会多次调用&nbsp;<em>sumRange</em>&nbsp;方法。</li>
 * </ol>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>range-sum-query-2d-immutable</li>
 *   <li>range-sum-query-mutable</li>
 *   <li>maximum-size-subarray-sum-equals-k</li>
 * </ul>
 */
@Problem(
    id = 303,
    name = "range-sum-query-immutable",
    difficulty = Difficulty.EASY,
    tags = {Tag.DYNAMIC_PROGRAMMING}
)
public class RangeSumQueryImmutable {
}
