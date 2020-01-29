package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/contains-duplicate-iii/">存在重复元素 III</a>
 *
 * <p>给定一个整数数组，判断数组中是否有两个不同的索引 <em>i</em> 和 <em>j</em>，使得&nbsp;<strong>nums [i]</strong> 和&nbsp;<strong>nums [j]</strong>&nbsp;的差的绝对值最大为 <em>t</em>，并且 <em>i</em> 和 <em>j</em> 之间的差的绝对值最大为 <em>ķ</em>。</p>
 *
 * <p><strong>示例&nbsp;1:</strong></p>
 *
 * <pre><strong>输入:</strong> nums = [1,2,3,1], k<em> </em>= 3, t = 0
 * <strong>输出:</strong> true</pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre><strong>输入: </strong>nums = [1,0,1,1], k<em> </em>=<em> </em>1, t = 2
 * <strong>输出:</strong> true</pre>
 *
 * <p><strong>示例 3:</strong></p>
 *
 * <pre><strong>输入: </strong>nums = [1,5,9,1,5,9], k = 2, t = 3
 * <strong>输出:</strong> false</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>contains-duplicate</li>
 *   <li>contains-duplicate-ii</li>
 * </ul>
 */
@Problem(
    id = 220,
    name = "contains-duplicate-iii",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.SORT, Tag.ORDERED_MAP}
)
public class ContainsDuplicateIII {
}
