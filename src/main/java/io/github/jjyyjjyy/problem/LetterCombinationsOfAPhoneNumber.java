package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Complexity;
import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * <a href="https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number/">电话号码的字母组合</a>
 *
 * <p>给定一个仅包含数字&nbsp;<code>2-9</code>&nbsp;的字符串，返回所有它能表示的字母组合。</p>
 *
 * <p>给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。</p>
 *
 * <p><img src="https://assets.leetcode-cn.com/aliyun-lc-upload/original_images/17_telephone_keypad.png" style="width: 200px;"></p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre><strong>输入：</strong>&quot;23&quot;
 * <strong>输出：</strong>[&quot;ad&quot;, &quot;ae&quot;, &quot;af&quot;, &quot;bd&quot;, &quot;be&quot;, &quot;bf&quot;, &quot;cd&quot;, &quot;ce&quot;, &quot;cf&quot;].
 * </pre>
 *
 * <p><strong>说明:</strong><br>
 * 尽管上面的答案是按字典序排列的，但是你可以任意选择答案输出的顺序。</p>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>generate-parentheses</li>
 *   <li>combination-sum</li>
 *   <li>binary-watch</li>
 * </ul>
 */
@Problem(
    id = 17,
    name = "letter-combinations-of-a-phone-number",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.STRING, Tag.BACKTRACKING}
)
public class LetterCombinationsOfAPhoneNumber {

    private static final Map<Character, String> PHONE_MAP = Map.of('2', "abc", '3', "def", '4', "ghi", '5', "jkl", '6', "mno", '7', "pqrs", '8', "tuv", '9', "wxyz");

    @Complexity(value = Complexity.ComplexityType.O_DEFINE, complexity = "O(3^m*4^n)")
    public List<String> letterCombinations(String digits) {

        if (digits.isEmpty()) {
            return new ArrayList<>();
        }

        List<String> result = new ArrayList<>();
        backTracking(result, digits, 0, new StringBuilder());
        return result;
    }

    private void backTracking(List<String> result, String digits, int i, StringBuilder combination) {
        if (i == digits.length()) {
            result.add(combination.toString());
            return;
        }
        char c = digits.charAt(i);
        String phone = PHONE_MAP.get(c);
        for (int j = 0; j < phone.length(); j++) {
            combination.append(phone.charAt(j));
            backTracking(result, digits, i + 1, combination);
            combination.deleteCharAt(i);
        }
    }
}
