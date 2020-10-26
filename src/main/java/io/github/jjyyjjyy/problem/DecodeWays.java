package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/decode-ways/">解码方法</a>
 *
 * <p>一条包含字母&nbsp;<code>A-Z</code> 的消息通过以下方式进行了编码：</p>
 *
 * <pre>&#39;A&#39; -&gt; 1
 * &#39;B&#39; -&gt; 2
 * ...
 * &#39;Z&#39; -&gt; 26
 * </pre>
 *
 * <p>给定一个只包含数字的<strong>非空</strong>字符串，请计算解码方法的总数。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong> &quot;12&quot;
 * <strong>输出:</strong> 2
 * <strong>解释:</strong>&nbsp;它可以解码为 &quot;AB&quot;（1 2）或者 &quot;L&quot;（12）。
 * </pre>
 *
 * <p><strong>示例&nbsp;2:</strong></p>
 *
 * <pre><strong>输入:</strong> &quot;226&quot;
 * <strong>输出:</strong> 3
 * <strong>解释:</strong>&nbsp;它可以解码为 &quot;BZ&quot; (2 26), &quot;VF&quot; (22 6), 或者 &quot;BBF&quot; (2 2 6) 。
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>decode-ways-ii</li>
 * </ul>
 */
@Problem(
    id = 91,
    name = "decode-ways",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.STRING, Tag.DYNAMIC_PROGRAMMING}
)
public class DecodeWays {

    /**
     * 1. 依次遍历数组.
     * 2. 如果当前位为0且前一位也为0, 则直接返回0.
     * 3. 如果前一位与当前位加起来在0~26范围内, 则当前的次数要加上前一位的次数.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public int numDecodings(String s) {
        if (s.charAt(0) == '0') {
            return 0;
        }
        int pre = 1;
        int current = 1;
        for (int i = 1; i < s.length(); i++) {
            int tmp = current;
            if (s.charAt(i) == '0') {
                if (s.charAt(i - 1) == '1' || s.charAt(i - 1) == '2') {
                    current = pre;
                } else {
                    return 0;
                }
            } else if (s.charAt(i - 1) == '1' || s.charAt(i - 1) == '2' && s.charAt(i) >= '1' && s.charAt(i) <= '6') {
                current = current + pre;
            }
            pre = tmp;
        }
        return current;
    }
}
