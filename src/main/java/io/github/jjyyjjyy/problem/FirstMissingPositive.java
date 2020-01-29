package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/first-missing-positive/">缺失的第一个正数</a>
 *
 * <p>给定一个未排序的整数数组，找出其中没有出现的最小的正整数。</p>
 *
 * <p><strong>示例&nbsp;1:</strong></p>
 *
 * <pre>输入: [1,2,0]
 * 输出: 3
 * </pre>
 *
 * <p><strong>示例&nbsp;2:</strong></p>
 *
 * <pre>输入: [3,4,-1,1]
 * 输出: 2
 * </pre>
 *
 * <p><strong>示例&nbsp;3:</strong></p>
 *
 * <pre>输入: [7,8,9,11,12]
 * 输出: 1
 * </pre>
 *
 * <p><strong>说明:</strong></p>
 *
 * <p>你的算法的时间复杂度应为O(<em>n</em>)，并且只能使用常数级别的空间。</p>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>missing-number</li>
 *   <li>find-the-duplicate-number</li>
 *   <li>find-all-numbers-disappeared-in-an-array</li>
 *   <li>couples-holding-hands</li>
 * </ul>
 */
@Problem(
    id = 41,
    name = "first-missing-positive",
    difficulty = Difficulty.HARD,
    tags = {Tag.ARRAY}
)
public class FirstMissingPositive {
}
