package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <a href="https://leetcode-cn.com/problems/word-pattern/">单词规律</a>
 *
 * <p>给定一种规律 <code>pattern</code>&nbsp;和一个字符串&nbsp;<code>str</code>&nbsp;，判断 <code>str</code> 是否遵循相同的规律。</p>
 *
 * <p>这里的&nbsp;<strong>遵循&nbsp;</strong>指完全匹配，例如，&nbsp;<code>pattern</code>&nbsp;里的每个字母和字符串&nbsp;<code>str</code><strong>&nbsp;</strong>中的每个非空单词之间存在着双向连接的对应规律。</p>
 *
 * <p><strong>示例1:</strong></p>
 *
 * <pre><strong>输入:</strong> pattern = <code>&quot;abba&quot;</code>, str = <code>&quot;dog cat cat dog&quot;</code>
 * <strong>输出:</strong> true</pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre><strong>输入:</strong>pattern = <code>&quot;abba&quot;</code>, str = <code>&quot;dog cat cat fish&quot;</code>
 * <strong>输出:</strong> false</pre>
 *
 * <p><strong>示例 3:</strong></p>
 *
 * <pre><strong>输入:</strong> pattern = <code>&quot;aaaa&quot;</code>, str = <code>&quot;dog cat cat dog&quot;</code>
 * <strong>输出:</strong> false</pre>
 *
 * <p><strong>示例&nbsp;4:</strong></p>
 *
 * <pre><strong>输入:</strong> pattern = <code>&quot;abba&quot;</code>, str = <code>&quot;dog dog dog dog&quot;</code>
 * <strong>输出:</strong> false</pre>
 *
 * <p><strong>说明:</strong><br>
 * 你可以假设&nbsp;<code>pattern</code>&nbsp;只包含小写字母，&nbsp;<code>str</code>&nbsp;包含了由单个空格分隔的小写字母。&nbsp; &nbsp;&nbsp;</p>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>isomorphic-strings</li>
 *   <li>word-pattern-ii</li>
 * </ul>
 */
@Problem(
    id = 290,
    name = "word-pattern",
    difficulty = Difficulty.EASY,
    tags = {Tag.HASH_TABLE}
)
public class WordPattern {

    public boolean wordPattern(String pattern, String s) {
        String[] patterns = pattern.split("");
        String[] strs = s.split("\\s");
        if (pattern.length() != strs.length) {
            return false;
        }
        Map<String, String> mapper = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            String p = patterns[i];
            String str = strs[i];
            if (!mapper.containsKey(p)) {
                if (mapper.containsValue(str)) {
                    return false;
                }
                mapper.put(p, str);
            } else if (!Objects.equals(str, mapper.get(p))) {
                return false;
            }
        }
        return true;
    }
}
