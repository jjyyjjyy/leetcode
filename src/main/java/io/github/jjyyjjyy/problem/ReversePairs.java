package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/reverse-pairs/">翻转对</a>
 *
 * <p>给定一个数组&nbsp;<code>nums</code>&nbsp;，如果&nbsp;<code>i &lt; j</code>&nbsp;且&nbsp;<code>nums[i] &gt; 2*nums[j]</code>&nbsp;我们就将&nbsp;<code>(i, j)</code>&nbsp;称作一个<strong><em>重要翻转对</em></strong>。</p>
 *
 * <p>你需要返回给定数组中的重要翻转对的数量。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre>
 * <strong>输入</strong>: [1,3,2,3,1]
 * <strong>输出</strong>: 2
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre>
 * <strong>输入</strong>: [2,4,3,5,1]
 * <strong>输出</strong>: 3
 * </pre>
 *
 * <p><strong>注意:</strong></p>
 *
 * <ol>
 * 	<li>给定数组的长度不会超过<code>50000</code>。</li>
 * 	<li>输入数组中的所有数字都在32位整数的表示范围内。</li>
 * </ol>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>count-of-smaller-numbers-after-self</li>
 *   <li>count-of-range-sum</li>
 * </ul>
 */
@Problem(
    id = 493,
    name = "reverse-pairs",
    difficulty = Difficulty.HARD,
    tags = {Tag.SORT, Tag.BINARY_INDEXED_TREE, Tag.SEGMENT_TREE, Tag.BINARY_SEARCH, Tag.DIVIDE_AND_CONQUER}
)
public class ReversePairs {
}
