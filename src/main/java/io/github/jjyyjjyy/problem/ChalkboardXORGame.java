package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/chalkboard-xor-game/">黑板异或游戏</a>
 *
 * <p>一个黑板上写着一个非负整数数组 nums[i] 。小红和小明轮流从黑板上擦掉一个数字，小红先手。如果擦除一个数字后，剩余的所有数字按位异或运算得出的结果等于 0 的话，当前玩家游戏失败。&nbsp;(另外，如果只剩一个数字，按位异或运算得到它本身；如果无数字剩余，按位异或运算结果为&nbsp;0。）</p>
 *
 * <p>换种说法就是，轮到某个玩家时，如果当前黑板上所有数字按位异或运算结果等于 0，这个玩家获胜。</p>
 *
 * <p>假设两个玩家每步都使用最优解，当且仅当小红获胜时返回 <code>true</code>。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例：</strong></p>
 *
 * <pre><strong>输入:</strong> nums = [1, 1, 2]
 * <strong>输出:</strong> false
 * <strong>解释:</strong>
 * 小红有两个选择: 擦掉数字 1 或 2。
 * 如果擦掉 1, 数组变成 [1, 2]。剩余数字按位异或得到 1 XOR 2 = 3。那么小明可以擦掉任意数字，因为小红会成为擦掉最后一个数字的人，她总是会输。
 * 如果小红擦掉 2，那么数组变成[1, 1]。剩余数字按位异或得到 1 XOR 1 = 0。小红仍然会输掉游戏。
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * 	<li><code>1 &lt;= N &lt;= 1000</code></li>
 * 	<li><code>0 &lt;= nums[i] &lt;= 2^16</code></li>
 * </ul>
 */
@Problem(
    id = 828,
    name = "chalkboard-xor-game",
    difficulty = Difficulty.HARD,
    tags = {Tag.MATH}
)
public class ChalkboardXORGame {

    /**
     * 1. 数组长度为偶数时, 总能找到一个数使得异或结果不等于0.
     * 2. 如果全部异或结果为0, Alice擦掉后就能使得结果不为0, Alice胜利.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public boolean xorGame(int[] nums) {
        if ((nums.length & 1) == 0) {
            return true;
        }
        int sum = 0;
        for (int num : nums) {
            sum ^= num;
        }
        return sum == 0;
    }
}
