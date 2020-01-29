package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/delete-operation-for-two-strings/">两个字符串的删除操作</a>
 *
 * <p>给定两个单词&nbsp;<em>word1&nbsp;</em>和&nbsp;<em>word2</em>，找到使得&nbsp;<em>word1&nbsp;</em>和&nbsp;<em>word2&nbsp;</em>相同所需的最小步数，每步可以删除任意一个字符串中的一个字符。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre>
 * <strong>输入:</strong> &quot;sea&quot;, &quot;eat&quot;
 * <strong>输出:</strong> 2
 * <strong>解释:</strong> 第一步将&quot;sea&quot;变为&quot;ea&quot;，第二步将&quot;eat&quot;变为&quot;ea&quot;
 * </pre>
 *
 * <p><strong>说明:</strong></p>
 *
 * <ol>
 * 	<li>给定单词的长度不超过500。</li>
 * 	<li>给定单词中的字符只含有小写字母。</li>
 * </ol>
 * <p>
 * <p>
 * 相似问题:
 * <ul>
 *   <li>edit-distance</li>
 *   <li>minimum-ascii-delete-sum-for-two-strings</li>
 * </ul>
 */
@Problem(
    id = 583,
    name = "delete-operation-for-two-strings",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.STRING}
)
public class DeleteOperationforTwoStrings {
}
