package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.GuessGame;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/guess-number-higher-or-lower/">猜数字大小</a>
 *
 * <p>我们正在玩一个猜数字游戏。 游戏规则如下：<br>
 * 我从&nbsp;<strong>1</strong>&nbsp;到&nbsp;<em><strong>n</strong></em>&nbsp;选择一个数字。 你需要猜我选择了哪个数字。<br>
 * 每次你猜错了，我会告诉你这个数字是大了还是小了。<br>
 * 你调用一个预先定义好的接口&nbsp;<code>guess(int num)</code>，它会返回 3 个可能的结果（<code>-1</code>，<code>1</code>&nbsp;或 <code>0</code>）：</p>
 *
 * <pre>-1 : 我的数字比较小
 *  1 : 我的数字比较大
 *  0 : 恭喜！你猜对了！
 * </pre>
 *
 * <p><strong>示例 :</strong></p>
 *
 * <pre><strong>输入: </strong>n = 10, pick = 6
 * <strong>输出: </strong>6</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>first-bad-version</li>
 *   <li>guess-number-higher-or-lower-ii</li>
 *   <li>find-k-closest-elements</li>
 * </ul>
 */
@Problem(
    id = 374,
    name = "guess-number-higher-or-lower",
    difficulty = Difficulty.EASY,
    tags = {Tag.BINARY_SEARCH}
)
public class GuessNumberHigherOrLower extends GuessGame {

    public GuessNumberHigherOrLower(int pick) {
        super(pick);
    }

    public int guessNumber(int n) {
        return -1;
    }
}
