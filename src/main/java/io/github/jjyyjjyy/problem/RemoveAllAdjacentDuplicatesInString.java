package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/remove-all-adjacent-duplicates-in-string/">删除字符串中的所有相邻重复项</a>
 *
 * <p>给出由小写字母组成的字符串&nbsp;<code>S</code>，<strong>重复项删除操作</strong>会选择两个相邻且相同的字母，并删除它们。</p>
 *
 * <p>在 S 上反复执行重复项删除操作，直到无法继续删除。</p>
 *
 * <p>在完成所有重复项删除操作后返回最终的字符串。答案保证唯一。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例：</strong></p>
 *
 * <pre><strong>输入：</strong>&quot;abbaca&quot;
 * <strong>输出：</strong>&quot;ca&quot;
 * <strong>解释：</strong>
 * 例如，在 &quot;abbaca&quot; 中，我们可以删除 &quot;bb&quot; 由于两字母相邻且相同，这是此时唯一可以执行删除操作的重复项。之后我们得到字符串 &quot;aaca&quot;，其中又只有 &quot;aa&quot; 可以执行重复项删除操作，所以最后的字符串为 &quot;ca&quot;。
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ol>
 * 	<li><code>1 &lt;= S.length &lt;= 20000</code></li>
 * 	<li><code>S</code> 仅由小写英文字母组成。</li>
 * </ol>
 */
@Problem(
    id = 1128,
    name = "remove-all-adjacent-duplicates-in-string",
    difficulty = Difficulty.EASY,
    tags = {Tag.STACK}
)
public class RemoveAllAdjacentDuplicatesInString {

    /**
     * 1. 维护左右两个指针.
     * 2. 右指针从左到右遍历字符串:
     * 2.1. 如果左右指针所在字符相等, 则左指针左移, 删除结果集中该字符.
     * 2.2. 否则左指针右移, 并将当前字符加入到结果集中.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public String removeDuplicates(String S) {
        StringBuilder result = new StringBuilder();
        int left = -1;
        for (int i = 0; i < S.length(); i++) {
            if (left >= 0 && S.charAt(i) == result.charAt(left)) {
                result.deleteCharAt(left--);
            } else {
                result.append(S.charAt(i));
                left++;
            }
        }
        return result.toString();
    }
}
