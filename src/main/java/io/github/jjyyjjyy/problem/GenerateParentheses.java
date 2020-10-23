package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.List;

/**
 * <a href="https://leetcode-cn.com/problems/generate-parentheses/">括号生成</a>
 *
 * <p>给出&nbsp;<em>n</em>&nbsp;代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且<strong>有效的</strong>括号组合。</p>
 *
 * <p>例如，给出&nbsp;<em>n </em>=<em> </em>3，生成结果为：</p>
 *
 * <pre>[
 *   &quot;((()))&quot;,
 *   &quot;(()())&quot;,
 *   &quot;(())()&quot;,
 *   &quot;()(())&quot;,
 *   &quot;()()()&quot;
 * ]
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>letter-combinations-of-a-phone-number</li>
 *   <li>valid-parentheses</li>
 * </ul>
 */
@Problem(
    id = 22,
    name = "generate-parentheses",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.STRING, Tag.BACKTRACKING}
)
public class GenerateParentheses {

    public List<String> generateParenthesis(int n) {
        return null;
    }
}
