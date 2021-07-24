package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/latest-time-by-replacing-hidden-digits/">替换隐藏数字得到的最晚时间</a>
 *
 * <p>给你一个字符串 <code>time</code> ，格式为 <code> hh:mm</code>（小时：分钟），其中某几位数字被隐藏（用 <code>?</code> 表示）。</p>
 *
 * <p>有效的时间为 <code>00:00</code> 到 <code>23:59</code> 之间的所有时间，包括 <code>00:00</code> 和 <code>23:59</code> 。</p>
 *
 * <p>替换 <code>time</code> 中隐藏的数字，返回你可以得到的最晚有效时间。</p>
 *
 * <p> </p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>time = "2?:?0"
 * <strong>输出：</strong>"23:50"
 * <strong>解释：</strong>以数字 '2' 开头的最晚一小时是 23 ，以 '0' 结尾的最晚一分钟是 50 。
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>time = "0?:3?"
 * <strong>输出：</strong>"09:39"
 * </pre>
 *
 * <p><strong>示例 3：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>time = "1?:22"
 * <strong>输出：</strong>"19:22"
 * </pre>
 *
 * <p> </p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * 	<li><code>time</code> 的格式为 <code>hh:mm</code></li>
 * 	<li>题目数据保证你可以由输入的字符串生成有效的时间</li>
 * </ul>
 */
@Problem(
    id = 1858,
    name = "latest-time-by-replacing-hidden-digits",
    difficulty = Difficulty.EASY,
    tags = {Tag.STRING}
)
public class LatestTimeByReplacingHiddenDigits {

    /**
     * 时间最大值: 23:59
     */
    @Complexity(Complexity.ComplexityType.O_1)
    public String maximumTime(String time) {
        char[] chars = time.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            char current = chars[i];
            if (current == '?') {
                if (i == 0) {
                    if (chars[1] != '?' && (chars[1] - '0') > 3) {
                        current = '1';
                    } else {
                        current = '2';
                    }
                } else if (i == 3) {
                    current = '5';
                } else if (i == 4) {
                    current = '9';
                } else {
                    if (result.charAt(0) == '2') {
                        current = '3';
                    } else {
                        current = '9';
                    }
                }
            }
            result.append(current);
        }
        return result.toString();
    }
}
