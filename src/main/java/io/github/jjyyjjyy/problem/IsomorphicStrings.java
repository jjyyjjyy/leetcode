package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode-cn.com/problems/isomorphic-strings/">同构字符串</a>
 *
 * <p>给定两个字符串&nbsp;<em><strong>s&nbsp;</strong></em>和&nbsp;<strong><em>t</em></strong>，判断它们是否是同构的。</p>
 *
 * <p>如果&nbsp;<em><strong>s&nbsp;</strong></em>中的字符可以被替换得到&nbsp;<strong><em>t&nbsp;</em></strong>，那么这两个字符串是同构的。</p>
 *
 * <p>所有出现的字符都必须用另一个字符替换，同时保留字符的顺序。两个字符不能映射到同一个字符上，但字符可以映射自己本身。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong> <strong><em>s</em></strong> = <code>&quot;egg&quot;, </code><strong><em>t = </em></strong><code>&quot;add&quot;</code>
 * <strong>输出:</strong> true
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre><strong>输入:</strong> <strong><em>s</em></strong> = <code>&quot;foo&quot;, </code><strong><em>t = </em></strong><code>&quot;bar&quot;</code>
 * <strong>输出:</strong> false</pre>
 *
 * <p><strong>示例 3:</strong></p>
 *
 * <pre><strong>输入:</strong> <strong><em>s</em></strong> = <code>&quot;paper&quot;, </code><strong><em>t = </em></strong><code>&quot;title&quot;</code>
 * <strong>输出:</strong> true</pre>
 *
 * <p><strong>说明:</strong><br>
 * 你可以假设&nbsp;<em><strong>s&nbsp;</strong></em>和 <strong><em>t </em></strong>具有相同的长度。</p>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>word-pattern</li>
 * </ul>
 */
@Problem(
    id = 205,
    name = "isomorphic-strings",
    difficulty = Difficulty.EASY,
    tags = {Tag.HASH_TABLE}
)
public class IsomorphicStrings {

    /**
     * 1. 创建一个哈希表.
     * 2. 依次遍历两个字符串s,t:
     * 2.1. 如果哈希表中存在s字符, 那么判断如果value和t字符不相等则返回false.
     * 2.2. 如果哈希表中不存在s字符但values中存在t字符, 那么说明已经有另外一个字符映射到了t字符上了, 返回false.
     * 2.3. 将s字符和t字符映射关系保存到哈希表上.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> characterMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (characterMap.containsKey(sChar)) {
                if (characterMap.get(sChar) != tChar) {
                    return false;
                }
            } else if (characterMap.containsValue(tChar)) {
                return false;
            } else {
                characterMap.put(sChar, tChar);
            }
        }

        return true;
    }
}
