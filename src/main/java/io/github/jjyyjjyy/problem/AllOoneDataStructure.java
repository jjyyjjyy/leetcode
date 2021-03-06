package io.github.jjyyjjyy.problem;

import io.github.jjyyjjyy.core.Difficulty;
import io.github.jjyyjjyy.core.Problem;
import io.github.jjyyjjyy.core.Tag;

/**
 * <a href="https://leetcode-cn.com/problems/all-oone-data-structure/">全 O(1) 的数据结构</a>
 *
 * <p>实现一个数据结构支持以下操作：</p>
 *
 * <ol>
 * 	<li>Inc(key) - 插入一个新的值为 1 的 key。或者使一个存在的 key 增加一，保证 key 不为空字符串。</li>
 * 	<li>Dec(key) - 如果这个 key 的值是 1，那么把他从数据结构中移除掉。否者使一个存在的 key 值减一。如果这个 key 不存在，这个函数不做任何事情。key 保证不为空字符串。</li>
 * 	<li>GetMaxKey() - 返回 key 中值最大的任意一个。如果没有元素存在，返回一个空字符串<code>&quot;&quot;</code>。</li>
 * 	<li>GetMinKey() - 返回 key 中值最小的任意一个。如果没有元素存在，返回一个空字符串<code>&quot;&quot;</code>。</li>
 * </ol>
 *
 * <p>挑战：以 O(1) 的时间复杂度实现所有操作。</p>
 */
@Problem(
    id = 432,
    name = "all-oone-data-structure",
    difficulty = Difficulty.HARD,
    tags = {Tag.DESIGN}
)
public class AllOoneDataStructure {
}
