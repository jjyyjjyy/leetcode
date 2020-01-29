package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/boats-to-save-people/">救生艇</a>
 *
 * <p>第&nbsp;<code>i</code>&nbsp;个人的体重为&nbsp;<code>people[i]</code>，每艘船可以承载的最大重量为&nbsp;<code>limit</code>。</p>
 *
 * <p>每艘船最多可同时载两人，但条件是这些人的重量之和最多为&nbsp;<code>limit</code>。</p>
 *
 * <p>返回载到每一个人所需的最小船数。(保证每个人都能被船载)。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例 1：</strong></p>
 *
 * <pre><strong>输入：</strong>people = [1,2], limit = 3
 * <strong>输出：</strong>1
 * <strong>解释：</strong>1 艘船载 (1, 2)
 * </pre>
 *
 * <p><strong>示例 2：</strong></p>
 *
 * <pre><strong>输入：</strong>people = [3,2,2,1], limit = 3
 * <strong>输出：</strong>3
 * <strong>解释：</strong>3 艘船分别载 (1, 2), (2) 和 (3)
 * </pre>
 *
 * <p><strong>示例 3：</strong></p>
 *
 * <pre><strong>输入：</strong>people = [3,5,3,4], limit = 5
 * <strong>输出：</strong>4
 * <strong>解释：</strong>4 艘船分别载 (3), (3), (4), (5)</pre>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ul>
 * 	<li><code>1 &lt;=&nbsp;people.length &lt;= 50000</code></li>
 * 	<li><code>1 &lt;= people[i] &lt;=&nbsp;limit &lt;= 30000</code></li>
 * </ul>
 */
@Problem(
    id = 917,
    name = "boats-to-save-people",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.GREEDY, Tag.TWO_POINTERS}
)
public class BoatstoSavePeople {
}
