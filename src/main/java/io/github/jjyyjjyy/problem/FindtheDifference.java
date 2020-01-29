package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/find-the-difference/">找不同</a>
 *
 * <p>给定两个字符串 <em><strong>s</strong></em> 和 <em><strong>t</strong></em>，它们只包含小写字母。</p>
 *
 * <p>字符串&nbsp;<strong><em>t</em></strong>&nbsp;由字符串&nbsp;<strong><em>s</em></strong>&nbsp;随机重排，然后在随机位置添加一个字母。</p>
 *
 * <p>请找出在 <em><strong>t</strong></em> 中被添加的字母。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例:</strong></p>
 *
 * <pre>输入：
 * s = &quot;abcd&quot;
 * t = &quot;abcde&quot;
 *
 * 输出：
 * e
 *
 * 解释：
 * &#39;e&#39; 是那个被添加的字母。
 * </pre>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>single-number</li>
 * </ul>
 */
@Problem(
    id = 389,
    name = "find-the-difference",
    difficulty = Difficulty.EASY,
    tags = {Tag.BIT_MANIPULATION, Tag.HASH_TABLE}
)
public class FindtheDifference {
}
