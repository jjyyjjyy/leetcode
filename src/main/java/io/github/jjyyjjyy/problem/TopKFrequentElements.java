package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/top-k-frequent-elements/">前 K 个高频元素</a>
 *
 * <p>给定一个非空的整数数组，返回其中出现频率前&nbsp;<strong><em>k&nbsp;</em></strong>高的元素。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入: </strong>nums = [1,1,1,2,2,3], k = 2
 * <strong>输出: </strong>[1,2]
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre><strong>输入: </strong>nums = [1], k = 1
 * <strong>输出: </strong>[1]</pre>
 *
 * <p><strong>说明：</strong></p>
 *
 * <ul>
 * 	<li>你可以假设给定的&nbsp;<em>k&nbsp;</em>总是合理的，且 1 &le; k &le; 数组中不相同的元素的个数。</li>
 * 	<li>你的算法的时间复杂度<strong>必须</strong>优于 O(<em>n</em> log <em>n</em>) ,&nbsp;<em>n&nbsp;</em>是数组的大小。</li>
 * </ul>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>word-frequency</li>
 *   <li>kth-largest-element-in-an-array</li>
 *   <li>sort-characters-by-frequency</li>
 *   <li>split-array-into-consecutive-subsequences</li>
 *   <li>top-k-frequent-words</li>
 *   <li>k-closest-points-to-origin</li>
 * </ul>
 */
@Problem(
    id = 347,
    name = "top-k-frequent-elements",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.HEAP, Tag.HASH_TABLE}
)
public class TopKFrequentElements {
}
