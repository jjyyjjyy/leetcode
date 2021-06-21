package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode-cn.com/problems/binary-watch/">二进制手表</a>
 *
 * <p>二进制手表顶部有 4 个 LED 代表<strong>小时（0-11）</strong>，底部的 6 个 LED 代表<strong>分钟（0-59）</strong>。</p>
 *
 * <p>每个 LED 代表一个 0 或 1，最低位在右侧。</p>
 *
 * <p><img src="https://upload.wikimedia.org/wikipedia/commons/8/8b/Binary_clock_samui_moon.jpg" style="height:300px" /></p>
 *
 * <p>例如，上面的二进制手表读取 &ldquo;3:25&rdquo;。</p>
 *
 * <p>给定一个非负整数 <em>n&nbsp;</em>代表当前 LED 亮着的数量，返回所有可能的时间。</p>
 *
 * <p><strong>案例:</strong></p>
 *
 * <pre>
 * 输入: n = 1
 * 返回: [&quot;1:00&quot;, &quot;2:00&quot;, &quot;4:00&quot;, &quot;8:00&quot;, &quot;0:01&quot;, &quot;0:02&quot;, &quot;0:04&quot;, &quot;0:08&quot;, &quot;0:16&quot;, &quot;0:32&quot;]</pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>注意事项:</strong></p>
 *
 * <ul>
 * 	<li>输出的顺序没有要求。</li>
 * 	<li>小时不会以零开头，比如 &ldquo;01:00&rdquo;&nbsp;是不允许的，应为 &ldquo;1:00&rdquo;。</li>
 * 	<li>分钟必须由两位数组成，可能会以零开头，比如 &ldquo;10:2&rdquo;&nbsp;是无效的，应为 &ldquo;10:02&rdquo;。</li>
 * </ul>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>letter-combinations-of-a-phone-number</li>
 *   <li>number-of-1-bits</li>
 * </ul>
 */
@Problem(
    id = 401,
    name = "binary-watch",
    difficulty = Difficulty.EASY,
    tags = {Tag.BIT_MANIPULATION}
)
public class BinaryWatch {

    /**
     * 枚举小时和分钟, 判断小时和分钟中1的数量是否等于turnedOn.
     */
    @Complexity(Complexity.ComplexityType.O_1)
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 60; j++) {
                if (Integer.bitCount(i) + Integer.bitCount(j) == turnedOn) {
                    result.add(i + ":" + (j > 9 ? j : ("0" + j)));
                }
            }
        }
        return result;
    }
}
