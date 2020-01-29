package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/backspace-string-compare/">比较含退格的字符串</a>
 *
 * <p>给定 <code>S</code> 和 <code>T</code> 两个字符串，当它们分别被输入到空白的文本编辑器后，判断二者是否相等，并返回结果。 <code>#</code> 代表退格字符。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><strong>输入：</strong>S = &quot;ab#c&quot;, T = &quot;ad#c&quot;
 * <strong>输出：</strong>true
 * <strong>解释：</strong>S 和 T 都会变成 &ldquo;ac&rdquo;。
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre><strong>输入：</strong>S = &quot;ab##&quot;, T = &quot;c#d#&quot;
 * <strong>输出：</strong>true
 * <strong>解释：</strong>S 和 T 都会变成 &ldquo;&rdquo;。
 * </pre>
 *
 * <p><strong>示例 3：</strong></p>
 *
 * <pre><strong>输入：</strong>S = &quot;a##c&quot;, T = &quot;#a#c&quot;
 * <strong>输出：</strong>true
 * <strong>解释：</strong>S 和 T 都会变成 &ldquo;c&rdquo;。
 * </pre>
 *
 * <p><strong>示例 4：</strong></p>
 *
 * <pre><strong>输入：</strong>S = &quot;a#c&quot;, T = &quot;b&quot;
 * <strong>输出：</strong>false
 * <strong>解释：</strong>S 会变成 &ldquo;c&rdquo;，但 T 仍然是 &ldquo;b&rdquo;。</pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ol>
 * 	<li><code>1 &lt;= S.length &lt;= 200</code></li>
 * 	<li><code>1 &lt;= T.length &lt;= 200</code></li>
 * 	<li><code>S</code> 和 <code>T</code> 只含有小写字母以及字符 <code>&#39;#&#39;</code>。</li>
 * </ol>
 *
 * <p>&nbsp;</p>
 */
@Problem(
    id = 874,
    name = "backspace-string-compare",
    difficulty = Difficulty.EASY,
    tags = {Tag.STACK, Tag.TWO_POINTERS}
)
public class BackspaceStringCompare {
}
