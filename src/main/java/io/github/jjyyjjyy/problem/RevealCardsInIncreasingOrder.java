package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/reveal-cards-in-increasing-order/">按递增顺序显示卡牌</a>
 *
 * <p>牌组中的每张卡牌都对应有一个唯一的整数。你可以按你想要的顺序对这套卡片进行排序。</p>
 *
 * <p>最初，这些卡牌在牌组里是正面朝下的（即，未显示状态）。</p>
 *
 * <p>现在，重复执行以下步骤，直到显示所有卡牌为止：</p>
 *
 * <ol>
 * 	<li>从牌组顶部抽一张牌，显示它，然后将其从牌组中移出。</li>
 * 	<li>如果牌组中仍有牌，则将下一张处于牌组顶部的牌放在牌组的底部。</li>
 * 	<li>如果仍有未显示的牌，那么返回步骤 1。否则，停止行动。</li>
 * </ol>
 *
 * <p>返回能以<strong>递增顺序</strong>显示卡牌的牌组顺序。</p>
 *
 * <p>答案中的第一张牌被认为处于牌堆顶部。</p>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>示例：</strong></p>
 *
 * <pre><strong>输入：</strong>[17,13,11,2,3,5,7]
 * <strong>输出：</strong>[2,13,3,11,5,17,7]
 * <strong>解释：
 * </strong>我们得到的牌组顺序为 [17,13,11,2,3,5,7]（这个顺序不重要），然后将其重新排序。
 * 重新排序后，牌组以 [2,13,3,11,5,17,7] 开始，其中 2 位于牌组的顶部。
 * 我们显示 2，然后将 13 移到底部。牌组现在是 [3,11,5,17,7,13]。
 * 我们显示 3，并将 11 移到底部。牌组现在是 [5,17,7,13,11]。
 * 我们显示 5，然后将 17 移到底部。牌组现在是 [7,13,11,17]。
 * 我们显示 7，并将 13 移到底部。牌组现在是 [11,17,13]。
 * 我们显示 11，然后将 17 移到底部。牌组现在是 [13,17]。
 * 我们展示 13，然后将 17 移到底部。牌组现在是 [17]。
 * 我们显示 17。
 * 由于所有卡片都是按递增顺序排列显示的，所以答案是正确的。
 * </pre>
 *
 * <p>&nbsp;</p>
 *
 * <p><strong>提示：</strong></p>
 *
 * <ol>
 * 	<li><code>1 &lt;= A.length &lt;= 1000</code></li>
 * 	<li><code>1 &lt;= A[i] &lt;= 10^6</code></li>
 * 	<li>对于所有的&nbsp;<code>i != j</code>，<code>A[i] != A[j]</code></li>
 * </ol>
 */
@Problem(
    id = 987,
    name = "reveal-cards-in-increasing-order",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.ARRAY}
)
public class RevealCardsInIncreasingOrder {
}
