package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode-cn.com/problems/remove-duplicate-letters/">去除重复字母</a>
 *
 * <p>给定一个仅包含小写字母的字符串，去除字符串中重复的字母，使得每个字母只出现一次。需保证返回结果的字典序最小（要求不能打乱其他字符的相对位置）。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong> <code>&quot;bcabc&quot;</code>
 * <strong>输出:</strong> <code>&quot;abc&quot;</code>
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre><strong>输入:</strong> <code>&quot;cbacdcbc&quot;</code>
 * <strong>输出:</strong> <code>&quot;acdb&quot;</code></pre>
 */
@Problem(
    id = 316,
    name = "remove-duplicate-letters",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.STACK, Tag.GREEDY, Tag.STRING}
)
public class RemoveDuplicateLetters {

    /**
     * 1. 维护一个双端队列
     * 2. 遍历字符串, 如果队列中存在该字符, 则略过.
     * 3. 遍历队列已有元素, 将队列中比当前字符大的且在后面的字符串中会出现的字符删除, 再将当前字符插入到队列中.
     */
    @Complexity(Complexity.ComplexityType.O_N)
    public String removeDuplicateLetters(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), i);
        }
        Deque<Character> list = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!list.contains(c)) {
                while (!list.isEmpty() && c < list.peekLast() && map.get(list.peekLast()) > i) {
                    list.pollLast();
                }
                list.add(c);
            }
        }
        StringBuilder result = new StringBuilder(list.size());
        for (Character character : list) {
            result.append(character);
        }
        return result.toString();
    }
}
