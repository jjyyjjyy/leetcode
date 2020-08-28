package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/find-the-duplicate-number/">寻找重复数</a>
 *
 * <p>给定一个包含&nbsp;<em>n</em> + 1 个整数的数组&nbsp;<em>nums</em>，其数字都在 1 到 <em>n&nbsp;</em>之间（包括 1 和 <em>n</em>），可知至少存在一个重复的整数。假设只有一个重复的整数，找出这个重复的数。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong> <code>[1,3,4,2,2]</code>
 * <strong>输出:</strong> 2
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre><strong>输入:</strong> [3,1,3,4,2]
 * <strong>输出:</strong> 3
 * </pre>
 *
 * <p><strong>说明：</strong></p>
 *
 * <ol>
 * 	<li><strong>不能</strong>更改原数组（假设数组是只读的）。</li>
 * 	<li>只能使用额外的 <em>O</em>(1) 的空间。</li>
 * 	<li>时间复杂度小于 <em>O</em>(<em>n</em><sup>2</sup>) 。</li>
 * 	<li>数组中只有一个重复的数字，但它可能不止重复出现一次。</li>
 * </ol>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>first-missing-positive</li>
 *   <li>single-number</li>
 *   <li>linked-list-cycle-ii</li>
 *   <li>missing-number</li>
 *   <li>set-mismatch</li>
 * </ul>
 */
@Problem(
    id = 287,
    name = "find-the-duplicate-number",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.ARRAY, Tag.TWO_POINTERS, Tag.BINARY_SEARCH}
)
public class FindTheDuplicateNumber {

    public int findDuplicate(int[] nums) {
        return -1;
    }
}
