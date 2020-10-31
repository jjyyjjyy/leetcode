package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/palindrome-number/">回文数</a>
 *
 * <p>判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong> 121
 * <strong>输出:</strong> true
 * </pre>
 *
 * <p><strong>示例&nbsp;2:</strong></p>
 *
 * <pre><strong>输入:</strong> -121
 * <strong>输出:</strong> false
 * <strong>解释:</strong> 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * </pre>
 *
 * <p><strong>示例 3:</strong></p>
 *
 * <pre><strong>输入:</strong> 10
 * <strong>输出:</strong> false
 * <strong>解释:</strong> 从右向左读, 为 01 。因此它不是一个回文数。
 * </pre>
 *
 * <p><strong>进阶:</strong></p>
 *
 * <p>你能不将整数转为字符串来解决这个问题吗？</p>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>palindrome-linked-list</li>
 * </ul>
 */
@Problem(
    id = 9,
    name = "palindrome-number",
    difficulty = Difficulty.EASY,
    tags = {Tag.MATH}
)
public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        if (x < 0 || x % 10 == 0 && x != 0) {
            return false;
        }
        int lastPart = 0;
        while (x > lastPart) {
            lastPart = lastPart * 10 + x % 10;
            x /= 10;
        }
        return x == lastPart || x == lastPart / 10;
    }
}
