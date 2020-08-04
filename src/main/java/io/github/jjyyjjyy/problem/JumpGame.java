package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/jump-game/">跳跃游戏</a>
 *
 * <p>给定一个非负整数数组，你最初位于数组的第一个位置。</p>
 *
 * <p>数组中的每个元素代表你在该位置可以跳跃的最大长度。</p>
 *
 * <p>判断你是否能够到达最后一个位置。</p>
 *
 * <p><strong>示例&nbsp;1:</strong></p>
 *
 * <pre><strong>输入:</strong> [2,3,1,1,4]
 * <strong>输出:</strong> true
 * <strong>解释:</strong> 我们可以先跳 1 步，从位置 0 到达 位置 1, 然后再从位置 1 跳 3 步到达最后一个位置。
 * </pre>
 *
 * <p><strong>示例&nbsp;2:</strong></p>
 *
 * <pre><strong>输入:</strong> [3,2,1,0,4]
 * <strong>输出:</strong> false
 * <strong>解释:</strong> 无论怎样，你总会到达索引为 3 的位置。但该位置的最大跳跃长度是 0 ， 所以你永远不可能到达最后一个位置。
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>jump-game-ii</li>
 * </ul>
 */
@Problem(
    id = 55,
    name = "jump-game",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.GREEDY, Tag.ARRAY}
)
public class JumpGame {

    public boolean canJump(int[] nums) {
        return false;
    }
}
