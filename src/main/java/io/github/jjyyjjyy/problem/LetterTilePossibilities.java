package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/letter-tile-possibilities/">活字印刷</a>
 *
 * <p>你有一套活字字模&nbsp;<code>tiles</code>，其中每个字模上都刻有一个字母&nbsp;<code>tiles[i]</code>。返回你可以印出的非空字母序列的数目。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><strong>输入：</strong>&quot;AAB&quot;
 * <strong>输出：</strong>8
 * <strong>解释：</strong>可能的序列为 &quot;A&quot;, &quot;B&quot;, &quot;AA&quot;, &quot;AB&quot;, &quot;BA&quot;, &quot;AAB&quot;, &quot;ABA&quot;, &quot;BAA&quot;。
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre><strong>输入：</strong>&quot;AAABBC&quot;
 * <strong>输出：</strong>188
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ol>
 * 	<li><code>1 &lt;= tiles.length &lt;= 7</code></li>
 * 	<li><code>tiles</code> 由大写英文字母组成</li>
 * </ol>
 */
@Problem(
    id = 1160,
    name = "letter-tile-possibilities",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.BACKTRACKING}
)
public class LetterTilePossibilities {
}
