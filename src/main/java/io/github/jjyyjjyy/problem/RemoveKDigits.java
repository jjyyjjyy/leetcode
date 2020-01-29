package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/remove-k-digits/">移掉K位数字</a>
 *
 * <p>给定一个以字符串表示的非负整数&nbsp;<em>num</em>，移除这个数中的 <em>k </em>位数字，使得剩下的数字最小。</p>
 *
 * <p><strong>注意:</strong></p>
 *
 * <ul>
 * 	<li><em>num</em> 的长度小于 10002 且&nbsp;&ge; <em>k。</em></li>
 * 	<li><em>num</em> 不会包含任何前导零。</li>
 * </ul>
 *
 * <p><strong>示例 1 :</strong></p>
 *
 * <pre>
 * 输入: num = &quot;1432219&quot;, k = 3
 * 输出: &quot;1219&quot;
 * 解释: 移除掉三个数字 4, 3, 和 2 形成一个新的最小的数字 1219。
 * </pre>
 *
 * <p><strong>示例 2 :</strong></p>
 *
 * <pre>
 * 输入: num = &quot;10200&quot;, k = 1
 * 输出: &quot;200&quot;
 * 解释: 移掉首位的 1 剩下的数字为 200. 注意输出不能有任何前导零。
 * </pre>
 *
 * <p>示例<strong> 3 :</strong></p>
 *
 * <pre>
 * 输入: num = &quot;10&quot;, k = 2
 * 输出: &quot;0&quot;
 * 解释: 从原数字移除所有的数字，剩余为空就是0。
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>create-maximum-number</li>
 *   <li>monotone-increasing-digits</li>
 * </ul>
 */
@Problem(
    id = 402,
    name = "remove-k-digits",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.STACK, Tag.GREEDY}
)
public class RemoveKDigits {
}
