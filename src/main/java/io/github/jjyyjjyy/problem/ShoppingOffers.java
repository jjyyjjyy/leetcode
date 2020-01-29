package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/shopping-offers/">大礼包</a>
 *
 * <p>在LeetCode商店中， 有许多在售的物品。</p>
 *
 * <p>然而，也有一些大礼包，每个大礼包以优惠的价格捆绑销售一组物品。</p>
 *
 * <p>现给定每个物品的价格，每个大礼包包含物品的清单，以及待购物品清单。请输出<strong>确切</strong>完成待购清单的最低花费。</p>
 *
 * <p>每个大礼包的由一个数组中的一组数据描述，最后一个数字代表大礼包的价格，其他数字分别表示内含的其他种类物品的数量。</p>
 *
 * <p>任意大礼包可无限次购买。</p>
 *
 * <p><strong>示例 1:</strong></p>
 *
 * <pre><strong>输入:</strong> [2,5], [[3,0,5],[1,2,10]], [3,2]
 * <strong>输出:</strong> 14
 * <strong>解释:</strong>
 * 有A和B两种物品，价格分别为&yen;2和&yen;5。
 * 大礼包1，你可以以&yen;5的价格购买3A和0B。
 * 大礼包2， 你可以以&yen;10的价格购买1A和2B。
 * 你需要购买3个A和2个B， 所以你付了&yen;10购买了1A和2B（大礼包2），以及&yen;4购买2A。</pre>
 *
 * <p><strong>示例 2:</strong></p>
 *
 * <pre><strong>输入:</strong> [2,3,4], [[1,1,0,4],[2,2,1,9]], [1,2,1]
 * <strong>输出:</strong> 11
 * <strong>解释:</strong>
 * A，B，C的价格分别为&yen;2，&yen;3，&yen;4.
 * 你可以用&yen;4购买1A和1B，也可以用&yen;9购买2A，2B和1C。
 * 你需要买1A，2B和1C，所以你付了&yen;4买了1A和1B（大礼包1），以及&yen;3购买1B， &yen;4购买1C。
 * 你不可以购买超出待购清单的物品，尽管购买大礼包2更加便宜。
 * </pre>
 *
 * <p><strong>说明:</strong></p>
 *
 * <ol>
 * 	<li>最多6种物品， 100种大礼包。</li>
 * 	<li>每种物品，你最多只需要购买6个。</li>
 * 	<li>你不可以购买超出待购清单的物品，即使更便宜。</li>
 * </ol>
 */
@Problem(
    id = 638,
    name = "shopping-offers",
    difficulty = Difficulty.MEDIUM,
    tags = {Tag.DEPTH_FIRST_SEARCH, Tag.DYNAMIC_PROGRAMMING}
)
public class ShoppingOffers {
}
