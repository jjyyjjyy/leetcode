package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/count-and-say/">外观数列</a>
 *
 * <p>「外观数列」是一个整数序列，从数字 1 开始，序列中的每一项都是对前一项的描述。前五项如下：</p>
 *
 * <pre>
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * </pre>
 *
 * <p><code>1</code>&nbsp;被读作&nbsp;&nbsp;<code>&quot;one 1&quot;</code>&nbsp;&nbsp;(<code>&quot;一个一&quot;</code>) , 即&nbsp;<code>11</code>。<br>
 * <code>11</code> 被读作&nbsp;<code>&quot;two 1s&quot;</code>&nbsp;(<code>&quot;两个一&quot;</code>）, 即&nbsp;<code>21</code>。<br>
 * <code>21</code> 被读作&nbsp;<code>&quot;one 2&quot;</code>, &nbsp;&quot;<code>one 1&quot;</code>&nbsp;（<code>&quot;一个二&quot;</code>&nbsp;,&nbsp;&nbsp;<code>&quot;一个一&quot;</code>)&nbsp;, 即&nbsp;<code>1211</code>。</p>
 *
 * <p>给定一个正整数 <em>n</em>（1 &le;&nbsp;<em>n</em>&nbsp;&le; 30），输出外观数列的第 <em>n</em> 项。</p>
 *
 * <p>注意：整数序列中的每一项将表示为一个字符串。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例&nbsp;1:</strong></p>
 *
 * <pre><strong>输入:</strong> 1
 * <strong>输出:</strong> &quot;1&quot;
 * <strong>解释：</strong>这是一个基本样例。</pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre><strong>输入:</strong> 4
 * <strong>输出:</strong> &quot;1211&quot;
 * <strong>解释：</strong>当 n = 3 时，序列是 &quot;21&quot;，其中我们有 &quot;2&quot; 和 &quot;1&quot; 两组，&quot;2&quot; 可以读作 &quot;12&quot;，也就是出现频次 = 1 而 值 = 2；类似 &quot;1&quot; 可以读作 &quot;11&quot;。所以答案是 &quot;12&quot; 和 &quot;11&quot; 组合在一起，也就是 &quot;1211&quot;。</pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>encode-and-decode-strings</li>
 *   <li>string-compression</li>
 * </ul>
 */
@Problem(
    id = 38,
    name = "count-and-say",
    difficulty = Difficulty.EASY,
    tags = {Tag.STRING}
)
public class CountAndSay {

    /**
     * 遍历前一次的结果, 依次统计每个相邻的相同字符串出现的次数, 拼接结果.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public String countAndSay(int n) {
        String res = "1";

        for (int i = 2; i <= n; i++) {
            char[] chars = res.toCharArray();
            char currentChar = chars[0];
            int count = 1;
            int p = 1;
            StringBuilder currentRes = new StringBuilder();
            while (true) {
                if (p == chars.length) {
                    currentRes.append(count).append(currentChar);
                    break;
                }
                if (chars[p] == currentChar) {
                    count++;
                } else {
                    currentRes.append(count).append(currentChar);
                    currentChar = chars[p];
                    count = 1;
                }
                p++;
            }
            res = currentRes.toString();
        }

        return res;
    }
}