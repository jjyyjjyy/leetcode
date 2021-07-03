package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <a href="https://leetcode-cn.com/problems/sort-characters-by-frequency/">根据字符出现频率排序</a>
 *
 * <p>给定一个字符串，请将字符串里的字符按照出现的频率降序排列。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong>
 * &quot;tree&quot;
 *
 * <strong>输出:</strong>
 * &quot;eert&quot;
 *
 * <strong>解释:
 * </strong>&#39;e&#39;出现两次，&#39;r&#39;和&#39;t&#39;都只出现一次。
 * 因此&#39;e&#39;必须出现在&#39;r&#39;和&#39;t&#39;之前。此外，&quot;eetr&quot;也是一个有效的答案。
 * </pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong>
 * &quot;cccaaa&quot;
 *
 * <strong>输出:</strong>
 * &quot;cccaaa&quot;
 *
 * <strong>解释:
 * </strong>&#39;c&#39;和&#39;a&#39;都出现三次。此外，&quot;aaaccc&quot;也是有效的答案。
 * 注意&quot;cacaca&quot;是不正确的，因为相同的字母必须放在一起。
 * </pre>
 *
 * <p><strong>示例 3:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong>
 * &quot;Aabb&quot;
 *
 * <strong>输出:</strong>
 * &quot;bbAa&quot;
 *
 * <strong>解释:
 * </strong>此外，&quot;bbaA&quot;也是一个有效的答案，但&quot;Aabb&quot;是不正确的。
 * 注意&#39;A&#39;和&#39;a&#39;被认为是两种不同的字符。
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>top-k-frequent-elements</li>
 *   <li>first-unique-character-in-a-string</li>
 * </ul>
 */
@Problem(
    id = 451,
    name = "sort-characters-by-frequency",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.HEAP, Tag.HASH_TABLE}
)
public class SortCharactersByFrequency {

    /**
     * 将字符按照出现次数排好序, 然后根据频次输出字符
     */
    @Complexity(value = Complexity.ComplexityType.O_DEFINE, complexity = "O(n+nlogn)")
    public String frequencySort(String s) {
        Map<Character, Integer> counts = new HashMap<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }
        List<Character> characters = new ArrayList<>(counts.keySet());
        characters.sort((a, b) -> counts.get(b) - counts.get(a));
        StringBuilder result = new StringBuilder();
        for (Character character : characters) {
            Integer freq = counts.get(character);
            for (int i = 0; i < freq; i++) {
                result.append(character);
            }
        }
        return result.toString();
    }
}
