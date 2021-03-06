package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/bulb-switcher/">灯泡开关</a>
 *
 * <p>初始时有&nbsp;<em>n&nbsp;</em>个灯泡关闭。 第 1 轮，你打开所有的灯泡。 第 2 轮，每两个灯泡你关闭一次。 第 3 轮，每三个灯泡切换一次开关（如果关闭则开启，如果开启则关闭）。第&nbsp;<em>i</em> 轮，每&nbsp;<em>i&nbsp;</em>个灯泡切换一次开关。 对于第&nbsp;<em>n&nbsp;</em>轮，你只切换最后一个灯泡的开关。 找出&nbsp;<em>n&nbsp;</em>轮后有多少个亮着的灯泡。</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre><strong>输入: </strong>3
 * <strong>输出:</strong> 1
 * <strong>解释:</strong>
 * 初始时, 灯泡状态 <strong>[关闭, 关闭, 关闭]</strong>.
 * 第一轮后, 灯泡状态 <strong>[开启, 开启, 开启]</strong>.
 * 第二轮后, 灯泡状态 <strong>[开启, 关闭, 开启]</strong>.
 * 第三轮后, 灯泡状态 <strong>[开启, 关闭, 关闭]</strong>.
 *
 * 你应该返回 1，因为只有一个灯泡还亮着。
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>bulb-switcher-ii</li>
 *   <li>minimum-number-of-k-consecutive-bit-flips</li>
 * </ul>
 */
@Problem(
    id = 319,
    name = "bulb-switcher",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.BRAINTEASER, Tag.MATH}
)
public class BulbSwitcher {

    public int bulbSwitch(int n) {
        return 0;
    }
}
