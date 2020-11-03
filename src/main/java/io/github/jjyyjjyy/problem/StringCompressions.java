package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/string-compression/">压缩字符串</a>
 *
 * <p>给定一组字符，使用<a href="https://baike.baidu.com/item/%E5%8E%9F%E5%9C%B0%E7%AE%97%E6%B3%95">原地算法</a>将其压缩。</p>
 *
 * <p>压缩后的长度必须始终小于或等于原数组长度。</p>
 *
 * <p>数组的每个元素应该是长度为1&nbsp;的<strong>字符</strong>（不是 int 整数类型）。</p>
 *
 * <p>在完成<a href="https://baike.baidu.com/item/%E5%8E%9F%E5%9C%B0%E7%AE%97%E6%B3%95">原地</a><strong>修改输入数组</strong>后，返回数组的新长度。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>进阶：</strong><br />
 * 你能否仅使用O(1) 空间解决问题？</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>
 * [&quot;a&quot;,&quot;a&quot;,&quot;b&quot;,&quot;b&quot;,&quot;c&quot;,&quot;c&quot;,&quot;c&quot;]
 *
 * <strong>输出：</strong>
 * 返回6，输入数组的前6个字符应该是：[&quot;a&quot;,&quot;2&quot;,&quot;b&quot;,&quot;2&quot;,&quot;c&quot;,&quot;3&quot;]
 *
 * <strong>说明：</strong>
 * &quot;aa&quot;被&quot;a2&quot;替代。&quot;bb&quot;被&quot;b2&quot;替代。&quot;ccc&quot;被&quot;c3&quot;替代。
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>
 * [&quot;a&quot;]
 *
 * <strong>输出：</strong>
 * 返回1，输入数组的前1个字符应该是：[&quot;a&quot;]
 *
 * <strong>说明：</strong>
 * 没有任何字符串被替代。
 * </pre>
 *
 * <p><strong>示例 3：</strong></p>
 *
 * <pre>
 * <strong>输入：</strong>
 * [&quot;a&quot;,&quot;b&quot;,&quot;b&quot;,&quot;b&quot;,&quot;b&quot;,&quot;b&quot;,&quot;b&quot;,&quot;b&quot;,&quot;b&quot;,&quot;b&quot;,&quot;b&quot;,&quot;b&quot;,&quot;b&quot;]
 *
 * <strong>输出：</strong>
 * 返回4，输入数组的前4个字符应该是：[&quot;a&quot;,&quot;b&quot;,&quot;1&quot;,&quot;2&quot;]。
 *
 * <strong>说明：</strong>
 * 由于字符&quot;a&quot;不重复，所以不会被压缩。&quot;bbbbbbbbbbbb&quot;被&ldquo;b12&rdquo;替代。
 * 注意每个数字在数组中都有它自己的位置。
 * </pre>
 *
 * <p><strong>注意：</strong></p>
 *
 * <ol>
 * 	<li>所有字符都有一个ASCII值在<code>[35, 126]</code>区间内。</li>
 * 	<li><code>1 &lt;= len(chars) &lt;= 1000</code>。</li>
 * </ol>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>count-and-say</li>
 *   <li>encode-and-decode-strings</li>
 *   <li>design-compressed-string-iterator</li>
 * </ul>
 */
@Problem(
    id = 443,
    name = "string-compressions",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.STRING}
)
public class StringCompressions {

    /**
     * 1. 维护两个指针, start标识第一个重复字符的位置, idx标识字符数组写入位置.
     * 2. 依次遍历数组, 如果当前位置是最后一个字符或者当前字符与下一个字符不相等, 则将当前字符和字符数量写入到数组中, 将start重置为下一个位置.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public int compress(char[] chars) {
        int start = 0;
        int idx = 0;
        for (int i = 0; i < chars.length; i++) {
            if (i == chars.length - 1 || chars[i] != chars[i + 1]) {
                chars[idx++] = chars[i];
                int count = i - start + 1;
                if (count > 1) {
                    for (char c : (count + "").toCharArray()) {
                        chars[idx++] = c;
                    }
                }
                start = i + 1;
            }
        }
        return idx;
    }
}