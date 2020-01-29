package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/move-zeroes/">移动零</a>
 *
 * <p>给定一个数组 <code>nums</code>，编写一个函数将所有 <code>0</code> 移动到数组的末尾，同时保持非零元素的相对顺序。</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre><strong>输入:</strong> <code>[0,1,0,3,12]</code>
 * <strong>输出:</strong> <code>[1,3,12,0,0]</code></pre>
 *
 * <p><strong>说明</strong>:</p>
 *
 * <ol>
 * 	<li>必须在原数组上操作，不能拷贝额外的数组。</li>
 * 	<li>尽量减少操作次数。</li>
 * </ol>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>remove-element</li>
 * </ul>
 */
@Problem(
    id = 283,
    name = "move-zeroes",
    difficulty = Difficulty.EASY,
    tags = {Tag.ARRAY, Tag.TWO_POINTERS}
)
public class MoveZeroes {
}
